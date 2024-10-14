package com.example.exam3.CS3Contact;

import com.example.exam3.Entity.People;

import java.util.List;
import java.util.Scanner;

/**
 * Classname: Client
 * Package: com.example.exam3.CS3Contact
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 20:53
 * @Version: v1.0
 */
public class Client {
    private static ServiceServer serviceServer = new ServiceServer();
    public static void main(String[] args) {
        serviceServer.init();
        for (;;)
        {
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
                    serviceServer.show();
                    continue;
                case 2:
                    System.out.println("输入姓名");
                    scanner = new Scanner(System.in);
                    name = scanner.nextLine();
                    System.out.println("输入电话");
                    scanner = new Scanner(System.in);
                    phone = scanner.nextLine();
                    serviceServer.add(name, phone);
                    continue;
                case 3:
                    System.out.println("输入姓名");
                    scanner = new Scanner(System.in);
                    name = scanner.nextLine();
                    System.out.println("输入电话");
                    scanner = new Scanner(System.in);
                    phone = scanner.nextLine();
                    serviceServer.update(name, phone);
                    continue;
                case 4:
                    System.out.println("输入姓名");
                    scanner = new Scanner(System.in);
                    name = scanner.nextLine();
                    serviceServer.delete(name);
                case 5:
                    break;
            }
        }
    }
}
