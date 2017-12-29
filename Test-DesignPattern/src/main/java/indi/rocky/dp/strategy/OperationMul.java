package indi.rocky.dp.strategy;

/**
 * Created by luoqi3 on 2017/12/29.
 */

/**
 * 策略：乘法
 */
public class OperationMul implements Strategy{

    public int doOperation(int num1, int num2) {
        return num1*num2;
    }
}
