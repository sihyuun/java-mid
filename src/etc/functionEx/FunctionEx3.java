package etc.functionEx;

public class FunctionEx3 {

    public int calculate(int number) {
        if (number == 1) {
            return 1;
        } else {
            return calculate(number - 1) + number;
        }

    }

    public static void main(String[] args) {
        int n = 10;

        FunctionEx3 ex3 = new FunctionEx3();

        System.out.println("1 + 2 + ... + " + n + " = " + ex3.calculate(n));
    }
}
