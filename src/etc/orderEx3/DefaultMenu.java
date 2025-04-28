package etc.orderEx3;

public class DefaultMenu implements Menu {

    @Override
    public int getPrice(String name) {
        int price = 0;
        System.out.println("메뉴가 없습니다.");
        return price;
    }
}
