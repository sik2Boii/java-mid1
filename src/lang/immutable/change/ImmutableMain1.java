package lang.immutable.change;

public class ImmutableMain1 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);

        // 계산 이후에도 기존값과 신규값 모두 확인 가능
        // 기존 객체를 변경한 것이 아닌
        // 변경된 값으로 새로운 객체를 만들어서
        // 불변성을 유지
        System.out.println("obj1 = " + obj1.getValue());
        System.out.println("obj2 = " + obj2.getValue());
    }

}
