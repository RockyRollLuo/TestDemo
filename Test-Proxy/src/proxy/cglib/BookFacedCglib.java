package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Rocky on 2017/12/4.
 */
public class BookFacedCglib implements MethodInterceptor {
    private Object target;

    //创建代理对象
    public Object getInstance(Object target){
        this.target=target;
        //工具类
        Enhancer enhancer=new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调方法
        enhancer.setCallback(this);
        //创建代理对象
        return enhancer.create();
    }

    //回调方法
    @Override
    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("事前处理消息");
        //执行目标对象的方法
        methodProxy.invokeSuper(obj,objects);
        System.out.println("事后处理消息");
        return null;
    }
}
