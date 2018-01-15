package indi.rocky.dp.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用命令类
 */
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    /**
     * 添加命令
     * @param order
     */
    public void takeOrder(Order order) {
        orderList.add(order);
    }

    /**
     * 执行命令
     */
    public void placeOrder() {
        for (Order order : orderList) {
            order.excute();
        }
        orderList.clear();
    }
}
