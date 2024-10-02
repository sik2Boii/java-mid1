package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);

        System.out.println("obj1 = " + obj1.getValue()); // 결과: 10
        // 불변 객체에서 변경과 관련된 것은 보통 리턴으로 객체를 반환하기 때문에,
        // 꼭 반환값을 받아야함
        // 받지 않으면 참조값을 알 수 없어서 사용불가능한 객체가 됨
    }

}
