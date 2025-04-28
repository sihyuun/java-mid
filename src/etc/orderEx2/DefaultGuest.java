package etc.orderEx2;

public class DefaultGuest implements Guest {
    @Override
    public boolean guest(int money, int amount) {
        System.out.println("guest 정보가 없습니다.");
        return false;
    }
}
