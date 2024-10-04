package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        // 순서 뒤집기
        sb.reverse();
        System.out.println("reverse = " + sb);

        //StringBuilder -> String
        // 가변         -> 불변
        String string = sb.toString();
        System.out.println("string = " + string);

        // 보통 문자열을 자주 변경할 때만 사용하다가,
        // 문자열 변경이 끝나면 안전한(불변) String로 변환하는 것을 권장
        // 계속 변할 수 있으면 사이드 이펙트가 발생하기 때문임
    }

}
