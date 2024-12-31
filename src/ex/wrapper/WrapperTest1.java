package ex.wrapper;

public class WrapperTest1 {

    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        // 코드 작성
        Integer i1 = Integer.valueOf(str1);
        Integer i2 = Integer.valueOf(str2);

        System.out.println("두 수의 합: " + Integer.sum(i1, i2));
    }

}
