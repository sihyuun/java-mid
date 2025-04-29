package etc.orderEx4;

public class OrderMain {

    public static void main(String[] args) {
        Guest guest = new Guest(150000, 2);
        Cook cook = new Cook();
        int sum = 0;
        int price = 20000;
        int order = price * guest.getQuantity();

        System.out.println("주문을 시작합니다.");
        while (true) {
            if (guest.getMoney() < order || guest.getMoney() == 0) {
                System.out.println("잔액 부족, 주문에 실패했습니다.");
                break;
            }
            System.out.println("주문 성공, 주문금액은 " + order + "원입니다.");
            guest.setMoney(guest.getMoney() - order);
            sum += order;
        }

        System.out.println("남은 금액은 " + guest.getMoney() + "원입니다.");
        System.out.println("총 결제 금액은 " + cook.getPrice(sum) + "원입니다.");
    }
}
