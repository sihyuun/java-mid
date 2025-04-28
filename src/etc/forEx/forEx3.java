package etc.forEx;

public class forEx3 {

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println();
            } else {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            }
        }

    }

}
