package cn.itcast.day04.May1902demo;

/**
 * 只能使用父类的东西，无任何子类内容
 * 假如父子类的成员变量出现重名会怎么样？
 * 当创建子类对象时，有两种访问方式
 * 【直接】字类
 * 【间接】通过成员方法访问成员变量 子类对象调用包含成员变量的某方法时，该方法在那个类里定义就算哪个
 *
 */
public class Fu {
    int numFu=10;
    int num = 100;

    public void Overrided(){

    }


    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);
    }
}
