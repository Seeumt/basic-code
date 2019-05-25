package cn.itcast.day04.May2002demo;

public class MydefaultImpldemo implements MyInterfaceDefaultdemo,MyInterfaceDefault_Plusdemo {
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    /**
     * 对于实现的这俩接口，冲突的默认方法要覆盖重写
     * 但是当父类中的方法与接口当中的默认方法冲突，会优先继承的父类
     *
     * 接口与接口之间是多继承的，一个接口可以继承好几个接口
     * 但是父接口当中的默认方法出现冲突，一旦要进行覆盖重写，但是必须带着default关键字
     */
    @Override
    public void methodConflict() {

    }
}
