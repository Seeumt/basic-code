package cn.itcast.day04.May2203demo;

public class Bodydemo01 {
    private String name="啵啵";
    public class Heartdemo02{//成员内部类


        public void beat(){
            System.out.println("心脏跳动~");
            System.out.println(name);
        }


    }

    public void methodBody(){
        System.out.println("外部类的方法");
        new Heartdemo02().beat();
    }
}
