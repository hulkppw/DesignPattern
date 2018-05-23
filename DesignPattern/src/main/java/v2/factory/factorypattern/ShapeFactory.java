package v2.factory.factorypattern;


public class ShapeFactory {
    public static Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }else if("CIRCLE".equalsIgnoreCase(shapeType)){
            return new Circle();
        }else if("RECTANGLE".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }else if("SQUARE".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}
