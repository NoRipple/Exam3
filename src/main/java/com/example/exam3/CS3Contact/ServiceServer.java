package com.example.exam3.CS3Contact;

import com.example.exam3.Entity.People;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classname: ServiceServer
 * Package: com.example.exam3.CS3Contact
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 20:54
 * @Version: v1.0
 */
public class ServiceServer {
    private DatabaseServer databaseServer = new DatabaseServer();
    public void init(){databaseServer.init();}
    public void show(){
        List<People> data = databaseServer.show();
        for (People datum : data) {
            System.out.println(datum.getName() +"-"+ datum.getPhone());
        }
    }
    public void add(String name, String phone){
        People people = new People(name, phone);
        databaseServer.add(people);
    }
    public void update(String name, String phone){
        People people = new People(name, phone);
        databaseServer.delete(name);
    }
    public void delete(String name){
        databaseServer.delete(name);
    }
}
