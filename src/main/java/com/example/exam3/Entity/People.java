package com.example.exam3.Entity;

/**
 * Classname: People
 * Package: com.example.exam3.CS2Contact
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 20:51
 * @Version: v1.0
 */
public class People {
    String name;
    String phone;

    public People(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
