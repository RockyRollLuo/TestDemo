package indi.rocky.dp.prototype;

public class Shape_Triangle extends Shape {

    public Shape_Triangle() {
        type="Triangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Triangle::draw()");
    }
}
