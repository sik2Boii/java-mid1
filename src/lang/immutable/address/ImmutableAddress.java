package lang.immutable.address;

public class ImmutableAddress {

    // final 키워드를 사용해서 더 명시적으로 표현 + 컴파일 에러로 검출 가능
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    // setValue 메서드를 안만들면 value 값을 변경하지 못해서 어차피 불변객체임
//    public void setValue(String value) {
//        this.value = value;
//    }

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
