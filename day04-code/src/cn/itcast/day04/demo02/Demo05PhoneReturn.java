package cn.itcast.day04.demo02;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        //赋值调用
        Phone three=getPhone();
        System.out.println(three);
    }
    public static Phone getPhone(){
        Phone two =new Phone();
        two.brand="iPhone";
        two.price=6666.6;
        two.color="gold";
        return two;
    }
}
