package cn.itcast.day04.May2203demo;

public class Outerdemo02 {
    int num = 10;
    public class Inner{
        int num= 20;
        public void InnerMethod(){
            int num =30;
            System.out.println(num);//局部变量，就近原则
            System.out.println(this.num);//内部类的成员变量
            /**
             * 外部类名称.this.外部类变量名
             */
            System.out.println(Outerdemo02.this.num);//====外部类的成员变量=====
        }
    }
}
