package cn.itcast.day04.May2101demo;

public class Computer {

    public void powerOn(){
        System.out.println("笔记本电脑开机！");
    }

    public void powerOff(){
        System.out.println("笔记本电脑关机！");
    }
//    使用接口作为方法参数
    public void useDevice(USB usb){
        usb.open();//  运行看右边！！！   要是输入一个具体的子类对象 调用接口里的抽象方法？ 就是全都有的方法（抽象方法）
        // 这样才能根据创建对象时  等号=右边的类名称 知道是什么这是个什么对象，应当给它调用属于它的覆盖重写后的方法
        //可是这样想不就是知道了 传进来的是某个实现类了吗？


        //        usb.click(); 父类怎么能调用子类非继承或实现方法呢？！
        if(usb instanceof Mouse){
            Mouse m = (Mouse) usb;//把usb向下转型
            m.click();
        }else if (usb instanceof Keyboard){
            Keyboard k =(Keyboard) usb;
            k.type();
        }

        usb.close();
    }
}
