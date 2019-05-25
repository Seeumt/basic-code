package cn.itcast.day04.May2002demo;

public class MyInterfaceDefaultAdemo implements MyInterfaceDefaultdemo {
    @Override
    public void method1() {
        System.out.println("实现AAAA");
        method2();//方法可以在方法体中直接调用
    }



    public static void main(String[] args) {
        MyInterfaceDefaultAdemo a = new MyInterfaceDefaultAdemo();
        a.method2();//调用从接口继承下来的默认方法，一般是在本类里面找，没有的话向上找接口
        a.method1();
    }

}
