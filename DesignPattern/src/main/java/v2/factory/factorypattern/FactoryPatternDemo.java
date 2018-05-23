package v2.factory.factorypattern;


public class FactoryPatternDemo {
    public static void main(String[] args){
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = ShapeFactory.getShape("square");
        square.draw();
    }
}
