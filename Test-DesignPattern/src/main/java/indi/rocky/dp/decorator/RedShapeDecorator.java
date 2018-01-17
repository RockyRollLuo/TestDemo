package indi.rocky.dp.decorator;

/**
 * @Date: 2018/1/16
 * @Author: luoqi3
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();

        //增加的方法
        setRedBorder(shape);
    }


    //新增的方法为private
    private void setRedBorder(Shape shape) {
        System.out.println("Border Color:Red");
    }
}
