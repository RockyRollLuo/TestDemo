package indi.rocky.dp.prototype;

public class Shape_Circle extends Shape{

    public Shape_Circle() {
        type="Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle:draw()");
    }
}
