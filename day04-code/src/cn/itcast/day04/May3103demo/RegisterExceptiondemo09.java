package cn.itcast.day04.May3103demo;

import java.util.Scanner;

public class RegisterExceptiondemo09 extends RegisterExceptiondemo08 {

//   使用数组保存已经注册过的用户名（数据表）
//    使用Scanner 获取用户输入的注册的用户名
//    定义一个方法，对用户输入的用户名进行判断
//    遍历已经注册过的用户名

    static String[] usernames = {"张三","里斯","尼古拉斯"};

    public static void main(String[] args) throws RegisterExceptiondemo08 {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名:");
        String username = in.next();
        checkUsername(username);
    }

    public static void checkUsername(String username) throws RegisterExceptiondemo08 {
        for (String name : usernames) {
            if(name.equals(username)){
              throw new RegisterExceptiondemo08("该用户名已经注册!");
            }

        }
    }
}
