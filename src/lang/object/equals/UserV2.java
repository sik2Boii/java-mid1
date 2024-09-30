package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        UserV2 user = (UserV2) obj;
//        return id.equals(user.id);
//    }

    /**
     * 동등성 비교가 항상 필요한 것은 아님
     * 동등성 비교가 필요한 경우에만 equals()를 재정의 하면됨
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }

}
