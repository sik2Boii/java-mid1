package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조값 대입을 막을 수는 없음, 문법상 오류 X
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // b를 부산으로 변경해야 함
//        b.setValue("부산"); // 컴파일 에러
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
