package cn.itcast.day04.May2001demo;

public class Zi extends Fu {

    public Zi() {

        super(6);
        System.out.println("子类方法执行了么");
    }

    public Zi(int a ){

        System.out.println(a);
    }

    public static void main(String[] args) {
        Zi zi =new Zi();
        Zi zi1 =new Zi(2);
    }


}
