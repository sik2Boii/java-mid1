package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object 클래스 메서드
        String string = child.toString(); // Object 클래스의 메서드임
        System.out.println(string);

        // 모든 클래스의 부모 클래스는 Object 클래스 이므로,
        // Object 클래스에서 제공하는 다양한 공통 기능을 사용할 수 있어 코드의 일관성을 제공
        // Object는 타입은 어떤 객체든 담을 수 있어 다형성을 제공
    }

}
