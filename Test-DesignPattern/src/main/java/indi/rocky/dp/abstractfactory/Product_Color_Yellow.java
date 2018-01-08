package indi.rocky.dp.abstractfactory;

public class Product_Color_Yellow implements Product_Color {
    public void fill() {
        System.out.println(this.getClass()+" fill yellow");
    }
}
