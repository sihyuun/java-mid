package etc.orderEx3;

public class Cook {

    int sum;
    public void orderPrice(int p) {
        sum += p;
        System.out.println("총 금액: " + sum);
    }

}
