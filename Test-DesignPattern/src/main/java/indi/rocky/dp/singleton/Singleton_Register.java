package indi.rocky.dp.singleton;

/**
 * Created by luoqi on 2018/1/4.
 */

/**
 * 登记式、静态内部类
 * 延迟对象的生成
 * 描述：这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
 * 而这种方式是 Singleton 类被装载了，instance 不一定被初始化。
 * 因为 SingletonHolder 类没有被主动使用，只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder 类，从而实例化 instance。
 */

public class Singleton_Register {

    //静态内部类
    private static class SingletonHolder {
        //final类型实例
        private static final Singleton_Register instance = new Singleton_Register();
    }

    //私有构造方法
    private Singleton_Register() {}

    /**
     * final类型get方法
     * @return
     */
    public static final Singleton_Register getInstancec() {
        return SingletonHolder.instance;
    }
}
