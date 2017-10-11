package cx.entity;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017-8-22.
 */
public class AdminSetForm {

    private Set<AdminEntity> admin ;

    public AdminSetForm() {
        admin = new LinkedHashSet<AdminEntity>();
        admin.add(new AdminEntity());
        admin.add(new AdminEntity());
    }

    public Set<AdminEntity> getAdmin() {
        return admin;
    }

    public void setAdmin(Set<AdminEntity> admin) {
        this.admin = admin;
    }

    @Override
    public String
    toString() {
        return "AdminSetForm{" +
                "admin=" + admin +
                '}';
    }
}
