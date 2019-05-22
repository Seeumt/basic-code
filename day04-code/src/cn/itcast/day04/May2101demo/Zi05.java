package cn.itcast.day04.May2101demo;

public class Zi05 extends Fu04 {
    int num = 20;

    public void Zimethod(){
        System.out.println("这是子方法");

    }

    public void commonMethod(){
        System.out.println("这是父类子类都有的方法，但是会优先用我！");
    }
}
