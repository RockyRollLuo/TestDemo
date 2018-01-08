package indi.rocky.dp.abstractfactory;

public abstract class AbstractFactory {
    abstract Product_Color getColor(String colorType);
    abstract Product_Shape getShape(String shapeType);
}
