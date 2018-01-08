package indi.rocky.dp.abstractfactory;

/**
 * 选择工厂类型
 */
public class FactoryProducer {

    public static AbstractFactory geFactory(String factoryType) {
        if (factoryType == null) {
            return null;
        }
        if (factoryType.equalsIgnoreCase("SHAPE")) {
            return new FactroyShape();
        } else if (factoryType.equalsIgnoreCase("COLOR")) {
            return new FactoryColor();
        }
        return null;
    }
}
