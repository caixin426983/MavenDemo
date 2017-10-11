package cx.entity;

import java.util.List;

/**
 * Created by Administrator on 2017-8-22.
 */
public class UserListForm {
    private List<UserEntity> userEntityList;


    public List<UserEntity> getUserEntityList() {
        return userEntityList;
    }

    public void setUserEntityList(List<UserEntity> userEntityList) {
        this.userEntityList = userEntityList;
    }

    @Override
    public String toString() {
        return "UserListForm{" +
                "userEntityList=" + userEntityList +
                '}';
    }
}
