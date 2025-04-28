package etc.orderEx1;

public class AMenu implements Menu {
    @Override
    public boolean menu(String name, int quantity) {
        System.out.println(name + "메뉴를 주문합니다.");
        return true;
    }
}
