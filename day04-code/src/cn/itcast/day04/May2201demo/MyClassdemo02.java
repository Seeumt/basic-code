package cn.itcast.day04.May2201demo;

/**
 * 用来修饰类的时候，格式
 * public final class 类名称{
 *
 * }
 * 当前这个类不能有任何的子类,so，所有的成员方法不能进行覆盖重写
 */
public final class MyClassdemo02 {
    public void method(){
        System.out.println("方法执行！");
    }
}
