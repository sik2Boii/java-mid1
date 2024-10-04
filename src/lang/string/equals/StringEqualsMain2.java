package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));
    }

    /**
     * 문자열 비교의 경우 협업 시
     * 객체를 생성해서 사용하는 개발자, 리터럴을 사용하는 개발자가 모두 있을 수 있기 때문에,
     * == 비교가 아닌 equals 비교를 사용함
     */
    private static boolean isSame(String x, String y) {
//        return x == y; // false, true
        return x.equals(y); // true, true
    }

}
