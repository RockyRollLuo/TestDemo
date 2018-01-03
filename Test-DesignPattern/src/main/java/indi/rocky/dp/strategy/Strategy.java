package indi.rocky.dp.strategy;

/**
 * Created by luoqi on 2017/12/29.
 */

/**
 * 策略的接口
 */
public interface Strategy {
    /**
     * 每一个策略是一个方法
     * @param num1
     * @param num2
     * @return
     */
    int doOperation(int num1,int num2);
}
