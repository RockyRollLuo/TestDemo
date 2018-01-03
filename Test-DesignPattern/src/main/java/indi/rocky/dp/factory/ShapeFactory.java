package indi.rocky.dp.factory;

/**
 * Created by luoqi on 2018/1/2.
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType == null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Shape_Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Shape_Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Shape_Square();
        }
        return null;
    }
}
