package cn.itcast.day04.demo02;

public class Phone {
    String brand;
    double price;
    String color;
    Boolean first;



    public void call(String who){
        System.out.println("给"+who+"打电话");
    }
    public void send(){
        System.out.println("送东西");
    }
    public void sayColor(){
        System.out.println("手机颜色是："+color);
    }

    }



