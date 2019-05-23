package cn.itcast.day04.May2203demo;

/**
 * 如果一个类是定义在一个方法（也就是外部类方法）内部的，那么就是一个局部内部类
 * 局部指只有当前所属的方法才能使用它，除了这个方法就不能使用了(在方法里面创建对象，当外部类创建对象调用此方法时，可能会涉及到该内部类创建的对象或者啥)
 * 定义格式：
 * 修饰符 class 外部类名称{
 *      修饰符 返回值类型 外部类名称(参数列表){
 *          class 局部内部类{
 *              ......
 *          }
 *      }
 *
 * }
 */
public class Outerdemo03 {
    public void OuterMethod1(){
        class Inner{
            int num = 10;
            public void InnerMethod1(){
                System.out.println(num);
            }
        }
        Inner inner = new Inner();
        inner.InnerMethod1();
    }
}
