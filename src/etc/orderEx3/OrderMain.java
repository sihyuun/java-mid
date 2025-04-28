package etc.orderEx3;

import java.util.Scanner;

public class OrderMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OrderService orderService = new OrderService();
        Cook cook = new Cook();
        while (true) {
            System.out.println("== 메뉴 목록 ==");
            System.out.println("a: 메뉴 A, b: 메뉴 B, exit: 나가기");
            System.out.print("메뉴를 선택해주세요: ");
            String orderOption = input.nextLine();
            if (orderOption.equals("exit")) {
                System.out.println("주문을 종료합니다.");
                return;
            }
            System.out.print("주문 수량을 입력해주세요: ");
            int quantity = input.nextInt();
            input.nextLine();

            // orderOption: 선택한 메뉴
            // quantity: 주문 개수
            // processOrder return: sum(금액 * 개수)
            int sum = orderService.processOrder(orderOption, quantity);
            cook.orderPrice(sum);
        }

    }
}
