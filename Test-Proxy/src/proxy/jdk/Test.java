package proxy.jdk;

/**
 * Created by Rocky on 2017/12/4.
 */
public class Test {

    public void testProxy() throws Throwable{
        //实例化木目标对象
        UserService userService=new UserServiceImpl();

        //实例化Innocation
        MyInvocationHandler invocationHandler=new MyInvocationHandler(userService);

        //根据目标生成代理对象
        UserService proxy=(UserService)invocationHandler.getProxy();

        //调用代理对象方法
        proxy.add();
    }
}