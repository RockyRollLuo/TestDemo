package proxy.staticmethod;

/**
 * Created by luoqi3 on 2017/12/4.
 */

/**
 * 代理类，为了增强实现类
 */
public class CountProxy implements Count {
    private CountImpl countImpl;

    //覆盖默认构造器
    public CountProxy(CountImpl countImpl){
        this.countImpl=countImpl;
    }

    public void queryCount(){
        System.out.println("事前处理消息");
        //调用委托类方法
        countImpl.queryCount();
        System.out.println("事后处理消息");
    }

    public void updateCount() {
        System.out.println("事前处理消息");
        //调用委托类方法
        countImpl.updateCount();
        System.out.println("事后处理消息");
    }
}
