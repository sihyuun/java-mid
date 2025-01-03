package ex.wrapper;

import java.util.Random;

public class LottoGenerator {

    private final Random random = new Random();
    private int[] randomNumber;
    private int count;

    public int[] generate() {
        randomNumber = new int[6];
        count = 0;

        while (count < 6) {
            int number = random.nextInt(45) + 1;
            if (isUnique(number)) {
                randomNumber[count] = number;
                count++;
            }
        }
        return randomNumber;
    }

    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (randomNumber[i] == number) {
                return false;
            }
        }
        return true;
    }

}
