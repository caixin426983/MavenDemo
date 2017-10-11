package cx.entity;

import java.util.Map;

/**
 * Created by Administrator on 2017-8-22.
 */
public class AdminMapForm {
    private Map<String,AdminEntity> admin;


    public Map<String, AdminEntity> getAdmin() {
        return admin;
    }

    public void setAdmin(Map<String, AdminEntity> admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "AdminMapForm{" +
                "admin=" + admin +
                '}';
    }
}
