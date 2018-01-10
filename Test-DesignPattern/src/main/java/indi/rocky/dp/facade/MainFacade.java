package indi.rocky.dp.facade;


/**
 * 调用shapemaker这个外观类，不用担心每个类能能干什么，只管调用外观类中的方法
 * 类似于manager层，service层只管调用manager的 写操作 和 读操作 manager调用 writeDao 或 readDao
 */
public class MainFacade {
    public static void main(String[] args) {
        ShapeMaker shapeMaker=new ShapeMaker();

        shapeMaker.drawRenctangle();
        shapeMaker.drawCircle();
        shapeMaker.drawSquare();

        shapeMaker.drawAll();

    }
}
