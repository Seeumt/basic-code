package cn.itcast.day04.May1902demo;

/**
 * 局部变量             直接写
 * 本类中的成员变量     this.本类成员变量名
 * 父类的成员变量       super.父类成员变量名
 */

/**
 * 如果成员方法重名，创建下的对象在调用时，看是用谁创建的
 *
 * 覆盖重写的方法，子类的方法的返回值类型范围必须=====小于等于====父类的返回值类型，比如object的范围大于String
 *
 * 子类方法的权限修饰符的范围必须=====大于等于======父类的权限修饰符范围
 *
 * public protected (default啥也不写) private
 */
public class Zi extends Fu {
    int numZi = 20;
    int num = 100;
    public void method(){
        int num = 30;
    }

    @Override//检测是不是正确的覆盖重写
    public void Overrided(){

    }

    public static void main(String[] args) {
        Zi zi = new Zi();
        System.out.println(zi.numZi);
        System.out.println(zi.numFu);
    }
}
