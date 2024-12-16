package lang.immutable.address;

public class Immutable {

    private String value;
    public Immutable(String value) {
        this.value = value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }

}