package ex.wrapper;

public class LottoMain {

    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] randomNumber = lottoGenerator.generate();

        System.out.println("로또 번호: ");
        for (int lottoNumber : randomNumber) {
            System.out.println(lottoNumber + " ");
        }
    }

}
