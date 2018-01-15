package indi.rocky.dp.command;

public class Order_Buy implements Order {

    //请求
    private Stock stock;

    public Order_Buy(Stock stock) {
        this.stock = stock;
    }

    public void excute() {
        stock.buy();
    }
}
