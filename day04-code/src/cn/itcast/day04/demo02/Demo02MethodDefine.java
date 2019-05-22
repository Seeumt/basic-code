package cn.itcast.day04.demo02;

import java.sql.SQLOutput;

/*

 */
public class Demo02MethodDefine {
    public static void main(String[] args) {
        //System.out.println(sum(2, 8));
        sum(2,6);//没有数据结果
        //add();
        //sum(2,8);思考一下啊
    }

    public static void sum(int a, int b) {
        System.out.println("方法执行啦！");
        int result = a + b;
    }

    public static void add() {
        System.out.println("hh");
    }
}
