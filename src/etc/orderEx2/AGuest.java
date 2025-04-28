package etc.orderEx2;

public class AGuest implements Guest {
    @Override
    public boolean guest(int money, int amount) {
        System.out.println("guestA 정보: 보유 금액 = " + money + ", 배고픔 정도 = " + amount);
        return true;
    }
}
