package indi.rocky.dp.strategy;

/**
 * Created by luoqi on 2017/12/29.
 */

/**
 * 测试方法
 */
public class MainStrategy {
    public static void main(String[] args) {
        int num1=10,num2=5;   //测试数据
        int output;           //输出值

        //使用加法策略
        Context context = new Context(new OperationAdd());
        output = context.excuteStrategy(num1,num2);
        System.out.println("加法策略结果："+output);

        //使用减法策略
        context = new Context(new OperationSub());
        output = context.excuteStrategy(num1, num2);
        System.out.println("减法策略结果："+output);

        //使用乘法策略
        context = new Context(new OperationMul());
        output = context.excuteStrategy(num1, num2);
        System.out.println("乘法策略结果："+output);

    }
}
