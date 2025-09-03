public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factoryCircle = new CircleFactory();
        Shape shape = factoryCircle.createShape();
        shape.draw();

        factoryCircle = new SquareFactory();
        shape = factoryCircle.createShape();
        shape.draw();

        factoryCircle = new RectangleFactory();
        shape = factoryCircle.createShape();
        shape.draw();

    }
}
