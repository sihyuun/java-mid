package ex.string;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        // 코드 작성
        String[] fruit = fruits.split(",");
        for (String f : fruit) {
            System.out.println(f);
        }
        String joinFruit = String.join("->", fruit);
        System.out.println("joinedString = " + joinFruit);
    }

}
