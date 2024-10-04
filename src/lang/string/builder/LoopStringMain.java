package lang.string.builder;

public class LoopStringMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String result = "";

        for (int i = 0; i < 100000; i++) {
            result += "Hello Java ";
        }

        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms"); // 8205ms
        // 문자열 반복 횟수만큼 객체를 계속 생성함
    }

}
