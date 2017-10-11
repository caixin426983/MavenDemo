package cx.entity;

/**
 * Created by Administrator on 2017-8-22.
 */
public class AdminEntity {

        private  String name;

        private  Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminEntity that = (AdminEntity) o;

        if (!name.equals(that.name)) return false;
        return age.equals(that.age);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "AdminEntity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
