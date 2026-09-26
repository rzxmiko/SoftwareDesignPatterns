public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle of radius " + radius + " as Vector lines.");
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Drawing a square of side " + side + " as Vector lines.");
    }
}