package indi.rocky.dp.decorator;

/**
 * @Date: 2018/1/16
 * @Author: luoqi3
 */

/**
 * 实现shape接口的抽象装饰类
 *
 * 如果想增加新功能可以在继承此类，增加方法
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape shape;


    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }
}
