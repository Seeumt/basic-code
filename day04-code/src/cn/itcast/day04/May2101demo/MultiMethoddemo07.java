package cn.itcast.day04.May2101demo;

/**
 * 在多态的代码中，成员方法的访问规则是new的是谁就是谁，=右边，子类没有向上找
 *
 * 成员方法口诀：编译看左边，运行看右边 ,比如下面这个Fu04当中没有Zimethod方法，所以编译报错
 *
 * 成员变量口诀：编译看左边，运行还看左边
 */
public class MultiMethoddemo07 {
    public static void main(String[] args) {
        Fu04 obj = new Zi05();

        obj.commonMethod();
//        obj.Zimethod();Fu04当中没有Zimethod方法，所以编译报错

        obj.showNum();//通过成员方法，则该方法在谁里面，优先用谁（运行看右边），
        // 但这个是子类没有覆盖重写的前提，如果覆盖重写，就是子类的方法，没有则向上找
    }


}
