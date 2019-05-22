package cn.itcast.day04.May1902demo;

/**
 * 尽量不要改动老的类，
 */
public class NewPhone extends Phone{
//    没改动的没必要重复写了
//    @Override
//    public void call(){
//
//    }
//    @Override
//    public void send(){
//
//    }
    @Override
    public void show(){
        super.show();
        System.out.println("显示号码");
        System.out.println("显示姓名");
        System.out.println("显示头像");

    }
}
