package cn.itcast.day04.May2203demo;

public class MyOuterdemo05 {
    public void methodOuter(){
        int num=10;
       // num=20;

        class MyInner{
            /**
             * 如果局部内部类希望访问所在方法的局部变量，那么这个局部变量必须是【有效final的】
             */
            public void MyInnerMethod(){
                System.out.println(num);
            }
        }
    }
}
