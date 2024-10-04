package lang.string.builder;

public class LoopStringBuilderMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("Hello Java ");
        }
        String result = sb.toString();

        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms"); // 5ms
        // 문자열을 합칠 때 대부분 최적화가 제공되어 + 연산을 사용하면 되지만,
        // 반복문을 통해서 대량의 문자열을 합칠때는 StringBuilder를 사용하면 성능 최적화를 할수 있음
    }

}
