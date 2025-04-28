package etc.orderEx1;

public class DefaultMenu implements Menu {
    @Override
    public boolean menu(String name, int quantity) {
        System.out.println("메뉴가 없습니다.");
        return false;
    }
}
