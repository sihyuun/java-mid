package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        Immutable a = new Immutable("서울");
        Immutable b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Immutable address, String changeAddress) {
        System.out.println("주소 값을 변경합니다 -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
