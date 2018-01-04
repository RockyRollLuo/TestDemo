package indi.rocky.dp.singleton;

/**
 * Created by luoqi on 2018/1/4.
 */

/***
 * 懒汉式
 * 线程安全
 * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 优点：第一次调用才初始化，避免内存浪费。
 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 */
public class Singleton_Lazy2 {

    //注意是静态的私有实例
    private static Singleton_Lazy2 instance;

    /**
     * 私有构造方法
     */
    private Singleton_Lazy2() {}

    /**
     * 公共get实例方法,注意是static方法
     */
    public static synchronized Singleton_Lazy2 getInstance() {
        if (instance == null) {
            instance = new Singleton_Lazy2();
        }
        return instance;
    }
}
