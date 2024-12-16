package lang.immutable.address;

public class MemberV1 {

    public String name;
    private Immutable address;

    public MemberV1(String name, Immutable address) {
        this.name = name;
        this.address = address;
    }

    public Immutable getAddress() {
        return address;
    }

    public void setAddress(Immutable address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

}
