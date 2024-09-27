package lang.object;

// 부모가 없으면 묵시적으로 Object 클래스를 상속 받음
// 자동으로 넣어주기 때문에 extends Object 생략을 권장
public class Parent extends Object {

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
