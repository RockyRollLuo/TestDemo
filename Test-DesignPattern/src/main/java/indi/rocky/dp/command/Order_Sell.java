package indi.rocky.dp.command;

public class Order_Sell implements Order {
    private Stock stock;

    public Order_Sell(Stock stock) {
        this.stock = stock;
    }

    public void excute() {
        stock.sell();
    }
}
