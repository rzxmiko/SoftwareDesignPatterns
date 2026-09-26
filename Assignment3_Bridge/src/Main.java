public class Main {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 5.0f);
        Shape square = new Square(rasterRenderer, 10.0f);

        System.out.println("Initial Rendering");
        circle.draw();
        square.draw();

        System.out.println("\nDynamic Renderer Switch");
        circle.setRenderer(rasterRenderer);
        circle.draw();
    }
}