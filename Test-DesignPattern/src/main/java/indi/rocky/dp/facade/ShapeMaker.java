package indi.rocky.dp.facade;

/**
 * 外观类
 * 外观创建
 *
 * 把实现同一接口类的方法
 *
 *
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker(){
        circle=new Circle();
        rectangle=new Rectangle();
        square=new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRenctangle(){
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawAll(){
        System.out.println("---画出所有的图形---");
        square.draw();
        rectangle.draw();
        circle.draw();
    }

}

