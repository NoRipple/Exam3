package com.example.exam3.CS2Contact;

import com.example.exam3.Entity.People;

import java.util.ArrayList;
import java.util.List;

/**
 * Classname: Server
 * Package: com.example.exam3.CS2Contact
 * Description:
 * 模拟数据库服务器
 * @Author: No_Ripple(吴波)
 * @Creat： - 20:50
 * @Version: v1.0
 */
public class Server {
    List<People> data = new ArrayList<>();
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
