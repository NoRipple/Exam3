package com.example.exam3.CS2Contact;

import com.example.exam3.Entity.People;

import java.util.List;
import java.util.Scanner;

/**
 * Classname: Client
 * Package: com.example.exam3.CS2Contact
 * Description:
 * 模拟客户机，用方法调用的方式模拟网络连接。
 * @Author: No_Ripple(吴波)
 * @Creat： - 20:49
 * @Version: v1.0
 */
public class Client {
    public static void main(String[] args) {

        Server database = new Server();
        database.add(new People("a", "123"));
        database.add(new People("b", "123"));
        database.add(new People("c", "123"));
        database.add(new People("d", "123"));
        database.add(new People("e", "123"));
        for (;;){
            System.out.println("欢迎使用通讯簿管理系统");
            System.out.println("请选择使用功能");
            System.out.println("1:查看");
            System.out.println("2:添加");
            System.out.println("3:修改");
            System.out.println("4:删除");
            System.out.println("0:退出");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            String name;
            String phone;
            People people;
            switch (option) {
                case 1:
                    List<People> data = database.show();
                    for (People datum : data) {
                        System.out.println(datum.getName() +"-"+ datum.getPhone());
                    }
                    continue;
                case 2:
                    System.out.println("输入姓名");
                    scanner = new Scanner(System.in);
                    name = scanner.nextLine();
                    System.out.println("输入电话");
                    scanner = new Scanner(System.in);
                    phone = scanner.nextLine();
                    people = new People(name, phone);
                    database.add(people);
                    continue;
                case 3:
                    System.out.println("输入姓名");
                    scanner = new Scanner(System.in);
                    name = scanner.nextLine();
                    System.out.println("输入电话");
                    scanner = new Scanner(System.in);
                    phone = scanner.nextLine();
                    people = new People(name, phone);
                    database.delete(name);
                    continue;
                case 4:
                    System.out.println("输入姓名");
                    scanner = new Scanner(System.in);
                    name = scanner.nextLine();
                    database.delete(name);
                case 5:
                    break;
        }
    }
    }
}
