package calculator;

public class Main {

    public static void main(String[] args) {
        StrategyRegistry registry = new StrategyRegistry();
        Calculator calculator = new Calculator(registry.get("+"));

        System.out.println("2 + 3 = " + calculator.calculate(2, 3));

        calculator.setStrategy(registry.get("*"));
        System.out.println("2 * 3 = " + calculator.calculate(2, 3));

        calculator.setStrategy(registry.get("/"));
        System.out.println("10 / 4 = " + calculator.calculate(10, 4));

        registry.register("^", (a, b) -> Math.pow(a, b));
        calculator.setStrategy(registry.get("^"));
        System.out.println("2 ^ 5 = " + calculator.calculate(2, 5));
    }
}