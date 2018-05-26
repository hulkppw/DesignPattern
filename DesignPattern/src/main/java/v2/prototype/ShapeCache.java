package v2.prototype;

import java.util.Hashtable;
import java.util.Map;

public class ShapeCache {
    private static Map<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId){
        Shape cachedShap = shapeMap.get(shapeId);
        return (Shape) cachedShap.clone();
    }

    public static void loadCache(){
        Square square = new Square();
        square.setId("1");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
