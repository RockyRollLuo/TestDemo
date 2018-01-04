package indi.rocky.dp.singleton;

/**
 * Created by luoqi on 2018/1/4.
 */

/***
 * 懒汉式单例模式
 * 线程不安全
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。
 * 因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 */
public class Singleton_Lazy1 {

    //私有成员属性
    private static Singleton_Lazy1 instance;

    /**
     * 注意是私有的构造方法
     */
    private Singleton_Lazy1(){}

    /**
     * 公共get实例方法,注意是static方法
     */
    public static Singleton_Lazy1 getInstance(){
        if (instance == null) {
            instance=new Singleton_Lazy1();
        }
        return instance;
    }
}
