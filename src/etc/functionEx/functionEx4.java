package etc.functionEx;

public class functionEx4 {

    public int calculate(int number) {
        if (number < 2) {
            return number;
        } else {
            return calculate(number - 2) + calculate(number - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        functionEx4 ex4 = new functionEx4();

        System.out.println("Fibonacci(" + n + ") = " + ex4.calculate(n));
    }

}
