package cn.itcast.day04.May2101demo;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        Mouse mouse = new Mouse();
        USB usb =mouse;
        computer.useDevice(usb);

//            向上转型
//          USB usb1 = new Mouse();
//          computer.useDevice(usb1);
//
          Keyboard keyboard = new Keyboard();//发生了自动转型，向上转成了要求的“USB”类型
        //                                     使用多态语句向上转 Fu obj = new Zi();
        //                                     obj.method() //运行看右边！！
                                            //实现类向上转型成为接口类型（作为要求的某数据类型）

          computer.useDevice(keyboard);
          computer.useDevice( new Keyboard());

          computer.powerOff();
    }
}
