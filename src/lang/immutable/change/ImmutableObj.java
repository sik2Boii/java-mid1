package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        // 불변 객체이기 때문에,
        // 기존 객체는 변경하지 않고 값을 더한 새로운 객체를  생성함
        // 불변 객체 유지
        return new ImmutableObj(result);
    }

    public int getValue() {
        return value;
    }

}
