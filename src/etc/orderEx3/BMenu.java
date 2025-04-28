package etc.orderEx3;

public class BMenu implements Menu {

    @Override
    public int getPrice(String name) {
        int price = 20000;
        System.out.println(name + "메뉴를 주문합니다. 메뉴의 금액은 " + price + "원입니다.");
        return price;
    }
}
