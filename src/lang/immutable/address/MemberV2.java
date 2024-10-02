package lang.immutable.address;

public class MemberV2 {

    private String name;
    private ImmutableAddress address;

    public MemberV2(String name, ImmutableAddress address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public ImmutableAddress getAddress() {
        return address;
    }

    /**
     * MemberV2 객체의 address는 불변이 아니라 변경 가능함
     * 단 ImmutableAddress 객체의 value가 불변임
     */
    public void setAddress(ImmutableAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

}
