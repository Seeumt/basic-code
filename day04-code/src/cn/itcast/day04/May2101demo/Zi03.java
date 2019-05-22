package cn.itcast.day04.May2101demo;

public class Zi03 extends Fu02 {
    public void method(){
        System.out.println("子类方法");
    }

    public static void main(String[] args) {
        //使用多态的写法
        //左侧父类的引用，指向了右侧子类的对象
        Fu02 obj = new Zi03();
        obj.method();
    }
}
