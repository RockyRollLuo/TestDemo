package indi.rocky.dp.strategy;

/**
 * Created by luoqi3 on 2017/12/29.
 */

/**
 * 策略：减法
 */
public class OperationSub implements Strategy{
    public int doOperation(int num1, int num2) {
        return num1-num2;
    }
}
