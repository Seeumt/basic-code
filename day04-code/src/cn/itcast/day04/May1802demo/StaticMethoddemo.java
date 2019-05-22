package cn.itcast.day04.May1802demo;

/**
 * 一旦使用static修饰成员方法，那么这就成为了静态方法。这方法不属于对象，而是属于类的。
 * 像成员方法，没有static关键字，只能先创建对象，然后通过对象调用
 * 而静态方法，还可以用类名称来进行调用
 * 有static就推荐用类名称进行调用
 */
public class StaticMethoddemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        MyClass.methodStatic();
        myMethod();//对于本类当中的静态方法，可以省略类名称
        StaticMethoddemo.myMethod();//完全等效
    }


    public static void myMethod(){
        System.out.println("本类中的方法！ ");

    }
}
