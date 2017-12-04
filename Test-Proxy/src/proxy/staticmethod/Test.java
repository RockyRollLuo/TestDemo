package proxy.staticmethod;

/**
 * Created by luoqi3 on 2017/12/4.
 */
public class Test {
    public static void main(String[] args){
        CountImpl countImpl = new CountImpl();
        CountProxy countProxy=new CountProxy(countImpl);
        //调用方法
        countProxy.queryCount();
        countProxy.updateCount();
    }
}
