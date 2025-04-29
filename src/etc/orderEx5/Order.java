package etc.orderEx5;

public class Order {

    int sum = 0;
    public int orderPrice(int price) {
        sum += price;
        return sum;
    }
}
