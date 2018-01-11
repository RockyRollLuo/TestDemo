package indi.rocky.dp.prototype;

public class Shape_Square extends Shape {

    public Shape_Square() {
        type="Square";
    }


    @Override
    void draw() {
        System.out.println("Inside Square:draw()");
    }
}
