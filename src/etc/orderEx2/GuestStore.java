package etc.orderEx2;

public abstract class GuestStore {

    public static Guest findGuest(String option) {
        if (option.equals("a")) {
            return new AGuest();
        } else if (option.equals("b")) {
            return new BGuest();
        } else if (option.equals("c")) {
            return new CGuest();
        } else {
            return new DefaultGuest();
        }
    }

}
