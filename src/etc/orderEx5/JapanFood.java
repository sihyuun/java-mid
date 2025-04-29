package etc.orderEx5;

public class JapanFood extends Food {

    @Override
    public void order() {
        System.out.println("일식을 주문합니다.");
    }

    @Override
    public void price(int price) {
        System.out.println("금액은 " + price + "원입니다.");
    }


}
