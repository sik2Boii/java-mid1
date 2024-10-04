package lang.wrapper;

public class MyIntegerNullMain1 {

    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};

        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));
    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {

        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        // 래퍼 클래스를 사용하면 임의의 기본형 값을 리턴으로 주지 않고,
        // null로 반환할 수 있음
        // 하지만 null도 NullPointerException이 발생할 수 있기 때문에 주의해서 사용해야함
        return null;
    }

}
