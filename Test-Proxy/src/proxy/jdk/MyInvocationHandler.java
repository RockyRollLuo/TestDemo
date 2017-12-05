package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Rocky on 2017/12/4.
 */

/**
 * 自定义简单的Invocation，对接口提供的方法进行增强
 */
public class MyInvocationHandler implements InvocationHandler {
    //目标对象
    private Object target;

    //构造方法
    public MyInvocationHandler(Object target){
        super();
        this.target=target;
    }

    //执行目标对象方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        System.out.println("事前处理消息");
        Object result=method.invoke(target, args);
        System.out.println("事后处理消息");
        return result;
    }

    /**
     * 获取目标对象的代理对象
     * @return 代理对象
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),this.target.getClass().getInterfaces(),this);
    }
}
