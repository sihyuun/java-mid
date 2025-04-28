package etc.orderEx3;

public class OrderService {

    public int processOrder(String option, int quantity) {

        System.out.println("주문을 시작합니다: option = " + option + ", quantity = " + quantity);
        // option: 메뉴 선택
        // quantity: 사용자 입력 수량
        // return sum
        // findMenu return: 메뉴
        Menu menu = MenuStore.findMenu(option);
        // sum: 합계
        int sum = 0;

        // getPrice: 메뉴의 가격
        int result = menu.getPrice(option);
        sum += result * quantity;

        return sum;

    }

}
