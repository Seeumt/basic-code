package cn.itcast.day04.May2002demo;

public class InterfaceMaindemo {
    public static void main(String[] args) {
        //不可以直接new接口对象使用
        //MyInterfaceAbstractdemo inter = new InterfaceMaindemo();
        MyInterfaceAbstractImpldemo impl = new MyInterfaceAbstractImpldemo();
    }
}
