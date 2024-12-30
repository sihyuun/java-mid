package ex.string;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        // 코드 작성
        System.out.println("filename = " + str.substring(0, 5));
        System.out.println("extName = " + ext.substring(ext.indexOf(".txt")));
    }

}
