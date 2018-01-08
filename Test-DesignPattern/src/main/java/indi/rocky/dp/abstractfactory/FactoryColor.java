package indi.rocky.dp.abstractfactory;

public class FactoryColor extends AbstractFactory {
    @Override
    public Product_Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }

        if (colorType.equalsIgnoreCase("GREEN")) {
            return new Product_Color_Green();
        } else if (colorType.equalsIgnoreCase("RED")) {
            return new Product_Color_Red();
        } else if (colorType.equalsIgnoreCase("YELLOW")) {
            return new Product_Color_Yellow();
        }
        return null;
    }

    @Override
    Product_Shape getShape(String shapeType) {
        return null;
    }
}
