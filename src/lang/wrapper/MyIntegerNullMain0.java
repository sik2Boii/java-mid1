package lang.wrapper;

public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};

        System.out.println(findValue(intArr, -1)); // -1
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); // -1
    }

    private static int findValue(int[] intArr, int target) {

        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        // 기본형은 항상 값이 존재해야 하므로 리턴 값을 무조건 지정해야함
        // 아무리 사용하지 않는 값이더라도 나중에 사용할 확률이 존재하기 때문에,
        // 안전하지 않다고 할 수 있음
        return -1;
    }

}
