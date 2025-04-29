package etc.orderEx4;

public class Guest {

    int money;
    int quantity;
    public Guest(int money, int quantity) {
        this.money = money;
        this.quantity = quantity;
    }

    public int getMoney() {
        return money;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
