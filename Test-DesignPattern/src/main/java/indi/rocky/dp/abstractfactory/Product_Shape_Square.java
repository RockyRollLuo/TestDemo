package indi.rocky.dp.abstractfactory;

public class Product_Shape_Square implements Product_Shape {
    public void draw() {
        System.out.println(this.getClass()+" draw square");
    }
}
