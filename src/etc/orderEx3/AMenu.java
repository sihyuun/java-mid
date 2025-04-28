package etc.orderEx3;

public class AMenu implements Menu {
    int price = 10000;
    @Override
    public int getPrice(String name) {
        System.out.println(name + "메뉴를 주문합니다. 메뉴의 금액은 " + price + "원입니다.");
        return price;
    }
}
