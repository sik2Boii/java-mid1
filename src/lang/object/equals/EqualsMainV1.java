package lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100"); // x001
        UserV1 user2 = new UserV1("id-100"); // x002

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + user1.equals(user2));
        /*
        public boolean equals(Object obj) {
        return (this == obj);
        }
         */
        // Object.equals()는 기본적으로 동일성 비교를 제공
        // 동일성 vs 동등성
        // 동일성: 두 객체의 참조가 일치
        // 동등성: 논리적으로 같은지 확인
        // 따라서 동등성 비교흫 원한다면 equals() 메서드를 재정의 해야함
    }

}
