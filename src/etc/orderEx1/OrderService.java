package etc.orderEx1;

public class OrderService {

    public void processOrder(String option, int quantity) {
        System.out.println("주문을 시작합니다: option = " + option + ", quantity = " + quantity);

        Restaurant restaurant=new Restaurant();
        restaurant.findMenu(option);

        Menu menu = MenuStore.findMenu(option);
        boolean result = menu.menu(option, quantity);

        if (result) {
            System.out.println("주문을 완료했습니다.");
        } else {
            System.out.println("주문에 실패했습니다.");
        }
    }
}
