package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("new String() == 비교: " + (str1 == str2)); // 동일성 비교
        System.out.println("new String() equals 비교: " + (str1.equals(str2))); // 동등성 비교

        System.out.println("==============================");

        // 리터럴을 사용하는 경우 자바는 메모리 효울과 성능 최적화를 위해서 문자열 풀을 사용
        // 자바 실행 시 문자열 리터럴이 있으면 String 인스턴스를 생성함
        // 같은 문자열을 가진 리터럴은 같은 참조 값을 찾아서 사용함
        String str3 = "hello"; // x003
        String str4 = "hello"; // x003

        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));
    }

}
