package cn.itcast.day04.demo04;

public class Demo04Debug {
    //先点断点再运行debug
    //哪行代码出现了问题，就在该行上一行添加一个断点
    //添加在每个方法的第一行（方法里面）
    //F8逐行执行程序
    //F7进入到方法中？？？？？？？？？？？？？？
    //SHIFT+F8 跳出方法 往出一跳的话就会全部执行方法内的所有语句体
    //左下方绿色箭头：F9，跳到下一个断点，如果没有 下一个断点就停止程序
    //ctrl+F2 退出debug
    public static void main(String[] args) {
       print();
        //int a=10;
//        int b=20;
//        int sum = a+b;
//        System.out.println(sum);
//        for (int i = 0; i < 3; i++) {
//            System.out.println(i)
//            }
    }
    public static void print(){
        System.out.println("Hello World1");
        System.out.println("Hello World2");
        System.out.println("Hello World3");
        System.out.println("Hello World4");
        System.out.println("Hello World5");
    }
}
