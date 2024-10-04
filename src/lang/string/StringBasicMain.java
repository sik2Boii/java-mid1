package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        String str1 = "hello"; // 이렇게 입력하면 자바에서 아래 코드로 변환해줌
        String str2 = new String("hello"); // String는 클래스임(대문자로 시작)
        // int, double, boolean 등은 기본형이지만, String는 참조형

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }

}
