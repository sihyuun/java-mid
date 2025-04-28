package etc.functionEx;

public class FunctionEx2 {

    public static void main(String[] args) {
        list(1);
    }

    public static void list(int number) {
        System.out.print(number + ", ");

        number = number + 1;

        if (number <= 10) {
            list(number);
        }

    }
}
