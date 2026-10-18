package calculator;

import java.util.HashMap;
import java.util.Map;

public class StrategyRegistry {

    private final Map<String, OperationStrategy> strategies = new HashMap<>();

    public StrategyRegistry() {
        register("+", new AddStrategy());
        register("-", new SubtractStrategy());
        register("*", new MultiplyStrategy());
        register("/", new DivideStrategy());
    }

    public void register(String symbol, OperationStrategy strategy) {
        strategies.put(symbol, strategy);
    }

    public OperationStrategy get(String symbol) {
        OperationStrategy strategy = strategies.get(symbol);
        if (strategy == null) {
            throw new IllegalArgumentException("Unknown operation: " + symbol);
        }
        return strategy;
    }
}