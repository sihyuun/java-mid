package ex.string;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        // 코드 작성
        int sum = 0;
        for (String string : arr) {
            System.out.println(string + ": " + arr.length);
            sum += string.length();
        }
        System.out.println("sum = " + sum);
    }

}
