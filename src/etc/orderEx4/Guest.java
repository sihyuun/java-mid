package etc.orderEx4;

public class Guest {

    int money;
    String option;
    public Guest(int money, String option) {
        this.money = money;
        this.option = option;
    }

    public int getMoney() {
        return money;
    }

    public String getOption() {
        return option;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setOption(String option) {
        this.option = option;
    }
}
