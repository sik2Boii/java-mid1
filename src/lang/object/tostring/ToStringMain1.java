package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();
        /*
        public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
         */

        // toString() 반환 값 출력
        System.out.println(string);

        // object 직접 출력
        System.out.println(object);
    }

}
