package indi.rocky.dp.singleton;

/**
 * Created by luoqi on 2018/1/4.
 */

/**
 * 饿汉式
 * 线程安全
 * 描述：它基于 classloder 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果。
 */
public class Singleton_Hungary {

    //私有静态成员，类加载时就会生成
    private static Singleton_Hungary instance=new Singleton_Hungary();

    //私有构造方法
    private Singleton_Hungary(){}

    //静态get方法
    public static Singleton_Hungary getInstance() {
        return instance;
    }

}
