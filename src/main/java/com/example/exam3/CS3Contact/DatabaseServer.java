package com.example.exam3.CS3Contact;

import com.example.exam3.Entity.People;

import java.util.ArrayList;
import java.util.List;

/**
 * Classname: DatabaseServer
 * Package: com.example.exam3.CS3Contact
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 20:54
 * @Version: v1.0
 */
public class DatabaseServer {
    List<People> data = new ArrayList<>();
    public void init() {
        data.add(new People("a", "123"));
        data.add(new People("b", "123"));
        data.add(new People("c", "123"));
        data.add(new People("d", "123"));
        data.add(new People("e", "123"));
        data.add(new People("f", "123"));
    }
    public void add(People people){
        data.add(people);
    }
    public List<People> show(){
        return data;
    }
    public People get(String name){
        for (People datum : data) {
            if (datum.getName().equals(name))
                return datum;
        }
        return null;
    }
    public void delete(String name){
        People people = get(name);
        data.remove(people);
    }

}
