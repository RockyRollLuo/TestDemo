package indi.rocky.dp.abstractfactory;

public class Product_Color_Red implements Product_Color {

    public void fill() {
        System.out.println(this.getClass()+" fill red");
    }
}
