package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        // String는 불변 객체로 설계되어서
        // 문자열을 합치면 기존 객체는 그대로 유지한 채로 새로운 객체를 생성해서 반환함
        // 그래서 새로운 참조값을 가지는 합쳐진 문자열을 사용하려면
        // 새로운 변수에 담아서 사용해야함
    }

}
