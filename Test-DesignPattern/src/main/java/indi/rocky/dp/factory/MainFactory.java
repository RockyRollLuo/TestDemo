package indi.rocky.dp.factory;

/**
 * Created by luoqi3 on 2018/1/2.
 */
public class MainFactory {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();

        //获取Cirlce对象，并调用它的draw方法
        Shape shape1=shapeFactory.getShape("CIRCLE");
        shape1.draw();

        //获取Cirlce对象，并调用它的draw方法
        Shape shape2=shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        //获取Cirlce对象，并调用它的draw方法
        Shape shape3=shapeFactory.getShape("SQUARE");
        shape3.draw();


    }

}
