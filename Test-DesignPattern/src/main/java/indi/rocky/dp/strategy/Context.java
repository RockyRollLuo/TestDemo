package indi.rocky.dp.strategy;

/**
 * Created by luoqi on 2017/12/29.
 */

/**
 * 所有策略的携带者
 * 调用接口的方法
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 执行策略
     * 要与策略接口的返回值一样
     * @param num1
     * @param num2
     */
    public int excuteStrategy(int num1, int num2){
        return strategy.doOperation(num1,num2);
    }
}
