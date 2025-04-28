package etc.orderEx1;

public class BMenu implements Menu {
    int price;
    int cal;

    @Override
    public boolean menu(String name, int quantity) {
        System.out.println(name + "메뉴를 주문합니다.");
        return true;
    }
}
