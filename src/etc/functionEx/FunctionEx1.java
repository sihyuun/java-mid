package etc.functionEx;

public class FunctionEx1 {

    public static void main(String[] args) {

        System.out.println("sum = " + sum(700, 500));
        System.out.println("subtraction = " + subtraction(700, 500));
        System.out.println("multiplication = " + multiplication(700, 500));
        System.out.println("divide = " + divide(700, 500));

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

}
