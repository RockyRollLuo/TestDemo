package indi.rocky.dp.prototype;

import java.util.Hashtable;

/**
 * 把所有的Shape都存在一个Hashtable中，
 * 此类中都是静态成员
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }


    public static void loadCache() {
        Shape_Circle circle = new Shape_Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Shape_Square square=new Shape_Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Shape_Triangle triangle=new Shape_Triangle();
        triangle.setId("3");
        shapeMap.put(triangle.getId(), triangle);
    }
}
