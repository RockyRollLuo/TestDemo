package indi.rocky.dp.abstractfactory;


public class MainAbstractFactory {

    public static void main(String[] args) {

        /*
         *  获取形状工厂
         */
        AbstractFactory factoryShape = FactoryProducer.geFactory("SHAPE");

        //圆形产品
        Product_Shape shape1 = factoryShape.getShape("CIRCLE");
        if (shape1 != null) {
            shape1.draw();
        }

        //长方形产品
        Product_Shape shape2 = factoryShape.getShape("RECTANGLE");
        if (shape2 != null) {
            shape2.draw();
        }

        //圆形产品
        Product_Shape shape3 = factoryShape.getShape("SQUARE");
        if (shape3 != null) {
            shape3.draw();
        }


        /*
         *  获取颜色工厂
         */
        AbstractFactory factoryColor = FactoryProducer.geFactory("COLOR");

        //红色产品
        Product_Color color1 = factoryColor.getColor("RED");
        if (color1 != null) {
            color1.fill();
        }

        //绿色产品
        Product_Color color2 = factoryColor.getColor("GREEN");
        if (color2 != null) {
            color2.fill();
        }

        //黄色产品
        Product_Color color3 = factoryColor.getColor("YELLOW");
        if (color3 != null) {
            color3.fill();
        }

    }

}
