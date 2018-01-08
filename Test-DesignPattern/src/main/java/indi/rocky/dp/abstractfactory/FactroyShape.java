package indi.rocky.dp.abstractfactory;

public class FactroyShape extends AbstractFactory {
    @Override
    Product_Color getColor(String colorType) {
        return null;
    }

    @Override
    Product_Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Product_Shape_Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Product_Shape_Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Product_Shape_Square();
        }

        return null;
    }
}
