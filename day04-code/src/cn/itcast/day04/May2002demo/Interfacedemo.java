package cn.itcast.day04.May2002demo;

/**
 * 接口是多个类的公共规范
 * 接口是一种引用数据类型 最重要的内容就是其中的抽象方法
 *
 * 定义接口的格式
 * public interface 接口名称{
 *     //接口内容
 * }
 */
public class Interfacedemo {
    public static void main(String[] args) {
        MyInterfaceStaticImpldemo impl = new MyInterfaceStaticImpldemo();

//        impl.methodStatic(); 不可以通过接口实现类的对象来调用接口当中的静态方法
    }
}
