package indi.rocky.dp.command;

public class MainOrder {

    public static void main(String[] args) {
        Stock stock = new Stock();

        Order_Buy buyOrder = new Order_Buy(stock);
        Order_Sell sellOrder = new Order_Sell(stock);

        Broker broker=new Broker();
        broker.takeOrder(buyOrder);
        broker.takeOrder(sellOrder);

        broker.placeOrder();
    }

}


