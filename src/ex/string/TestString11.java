package ex.string;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";
        // 코드 작성

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }

}
