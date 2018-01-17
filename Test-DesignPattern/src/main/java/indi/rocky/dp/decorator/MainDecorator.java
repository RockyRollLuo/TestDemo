package indi.rocky.dp.decorator;

/**
 * @Date: 2018/1/16
 * @Author: luoqi3
 */
public class MainDecorator {
    public static void main(String[] args) {

        Shape circle = new Shape_Circle();

        Shape redCircle = new RedShapeDecorator(new Shape_Circle());

        Shape redSuqare = new RedShapeDecorator(new Shape_Square());


        System.out.println("============Circle with normal border===========");
        circle.draw();

        System.out.println("============Circle of red border================");
        redCircle.draw();

        System.out.println("============Square of rend border===============");
        redSuqare.draw();
    }
}
