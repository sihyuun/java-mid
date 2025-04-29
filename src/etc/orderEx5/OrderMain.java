package etc.orderEx5;

import java.util.Scanner;

public class OrderMain {

    public static void main(String[] args) {
        System.out.println("주문을 시작합니다.");

        Scanner scanner = new Scanner(System.in);
        JapanFood japanFood = new JapanFood();
        JapanCook japanCook = new JapanCook();
        KoreanFood koreanFood = new KoreanFood();
        KoreanCook koreanCook = new KoreanCook();
        Order order = new Order();
        japanCook.setPrice(8000);
        koreanCook.setPrice(9000);
        System.out.println("== 메뉴 목록 ==");
        System.out.println("a: 일식, b: 한식, exit: 나가기");
        System.out.print("메뉴를 선택해주세요: ");
        String orderOption = scanner.nextLine();

        int sum = 0;
        while (true) {
            if (orderOption.equals("a")) {
                japanCook.type();
                japanFood.order();
                japanFood.price(10000);
                return;
            } else if (orderOption.equals("b")) {
                koreanCook.type();
                koreanFood.order();
                koreanFood.price(20000);
            } else if (orderOption.equals("exit")) {
                System.out.println("주문을 종료합니다.");
                break;
            } else {
                System.out.println("메뉴가 없습니다.");
            }
        }



    }
}
