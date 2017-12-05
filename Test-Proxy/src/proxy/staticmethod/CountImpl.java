package proxy.staticmethod;

/**
 * Created by Rocky on 2017/12/4.
 */

/**
 * 委托类（包含业务逻辑）
 */
public class CountImpl implements Count {
    @Override
    public void queryCount(){
        System.out.println("查看账户方法");
    }
    @Override
    public void updateCount(){
        System.out.println("修改账户方法");
    }
}
