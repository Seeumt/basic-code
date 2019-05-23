package cn.itcast.day04.May2203demo;

/**
 * 如果接口的实现类（或者是父类的子类），只需要使用唯一一次
 * 那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】
 *
 * 匿名内部类的定义格式：
 * 接口名称 对象名 = new 接口名称{
 *     //覆盖重写所有抽象方法
 * };
 */
public class MyInterfaceMaindemo08 {
    public static void main(String[] args) {
        MyInterfaceImpldemo07 impl01 = new MyInterfaceImpldemo07();
        impl01.methodInterface();

        MyInterfacedemo06 impl02 = new MyInterfaceImpldemo07();
        impl02.methodInterface();
// public class MyInterfaceImpldemo07 implements MyInterfacedemo06 {
//            @Override
//            public void methodInterface() {
//                System.out.println("实现类已经覆盖重写接口中的方法"); }}
        MyInterfacedemo06 impl03 = new MyInterfacedemo06() {//省得去搞实现类了,new后面之所以是接口名称，就是表明匿名内部类需要实现那个接口
            @Override
            public void methodInterface() {
                System.out.println("使用匿名内部类 覆盖重写接口中的抽象方法");
            }
        };
        impl03.methodInterface();
        System.out.println("==========================");
        new MyInterfacedemo06(){
            @Override
            public void methodInterface() {
                System.out.println("使用匿名对象类，可以省略对象名称，但是调用方法只能调用一次");
            }
        }.methodInterface();
    }
}
