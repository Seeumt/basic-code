package cn.itcast.day04.demo02;

public class Demo04PhoneParam {

    public static void main(String[] args) {
        Phone one=new Phone();
        Phone two=new Phone();
        two.color="blue";
        method(two);

//        one.color="红色";
//        System.out.println(one.brand);
//        one.sayColor();
//        one.call("hhh");
    }
    public static void method(Phone param) {
        System.out.println(param.brand);
        System.out.println(param.color);

    }
}
