package etc.orderEx1;

import java.util.Scanner;

public class OrderMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OrderService orderService = new OrderService();

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

            orderService.processOrder(orderOption, quantity);
        }
    }
}
