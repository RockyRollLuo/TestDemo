package indi.rocky.zkrpc;

/**
 * Created by luoqi3 on 2017/12/25.
 */

/**
 * 服务接口实现类
 */
public class HelloServiceImpl implements HelloService {

    public String hello(String name) {
        return "Hello! "+name;
    }
}
