package etc.forEx;

public class forEx4 {

    public static void main(String[] args) {
        for (int i = 30; 0 < i; i--) {
            if (i % 2 != 0) {
                System.out.println();
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = 29; i < k; k--) {
                    System.out.print("**");
                }
                System.out.print("*");
            }
        }
    }
}
