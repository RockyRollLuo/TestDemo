package indi.rocky.dp.singleton;

/**
 * Created by luoqi on 2018/1/4.
 */

/**
 * 双重校验锁，double-checked locking
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 getInstance() 的性能对应用程序很关键。
 */
public class Singleton_DCL {

    //volatile保证线程对变量的内存可见性，静态
    private volatile static Singleton_DCL instance;

    //私有构造方法
    private Singleton_DCL(){}

    /**
     * 公有静态get方法
     * @return
     */
    public static Singleton_DCL getInstance() {
        if (instance == null) {
            //同步代码块
            synchronized (Singleton_DCL.class) {
                if (instance == null) {
                    instance=new Singleton_DCL();
                }
            }
        }
        return instance;
    }

}
