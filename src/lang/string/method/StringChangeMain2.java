package lang.string.method;

public class StringChangeMain2 {

    public static void main(String[] args) {
        String strWithSpaces = " Java Programming ";

        System.out.println("소문자로 변환: " + strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환: " + strWithSpaces.toUpperCase());

        System.out.println("공백 제거(trim): '" + strWithSpaces.trim() + "'"); // space 공백만 제거
        System.out.println("공백 제거(strip): '" + strWithSpaces.strip() + "'"); // space와 유니코드 공백 모두 제거
        System.out.println("앞 공백 제거(strip): '" + strWithSpaces.stripLeading() + "'");
        System.out.println("뒤 공백 제거(strip): '" + strWithSpaces.stripTrailing() + "'");
    }

}
