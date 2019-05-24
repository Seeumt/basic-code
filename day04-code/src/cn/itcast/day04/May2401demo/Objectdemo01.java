package cn.itcast.day04.May2401demo;

public class Objectdemo01 {
    public static void main(String[] args) {
    Persondemo02 p1 = new Persondemo02("张三",18);
    Persondemo02 p2 = new Persondemo02("李四",28);
    Persondemo02 p3 = new Persondemo02("李四",28);
    Persondemo02 p4 = new Persondemo02("李四",28);
        String s =p1.toString();
        System.out.println(s);
/*
直接打印对象的名字，其实就是调用对象的toString() p=p.toString()
 */
        /*
            ==
        比较运算符
        基本数据类型比较的是值
        引用数据类型比较的是两个对象的地址值
            public boolean equals(Object obj) {
                return (this == obj);
                哪个对象调用的方法，this代表谁
          }
         */
        boolean b= p1.equals(p2);
        System.out.println(b);//false

        b= p3.equals(p4);
        System.out.println(b);//True


        p1=p2;
         b= p1.equals(p2);
        System.out.println(b);//True


    }
}
