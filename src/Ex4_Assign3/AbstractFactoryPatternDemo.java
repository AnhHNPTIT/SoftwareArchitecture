package Ex4_Assign3;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
        Shape shape3 = roundedShapeFactory.getShape("ROUNDEDRECTANGLE");
        shape3.draw();
        Shape shape4 = roundedShapeFactory.getShape("ROUNDEDSQUARE");
        shape4.draw();        
    }
}
