package cx.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017-7-21.
 */
public class MenuEntity{

    /**
     * 主键：id
     */
    private int id;

    /**
     * 名称
     */
    private String name;


    /**
     * 父级ID
     */
    private  int Pid;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int pid) {
        Pid = pid;
    }
}
