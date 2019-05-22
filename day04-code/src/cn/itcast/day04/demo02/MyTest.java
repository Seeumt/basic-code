package cn.itcast.day04.demo02;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MyTest {

    public static void main(String[] args) {
       Phone one=new Phone();
        one.color="红色";
        System.out.println(one.brand);
        one.sayColor();
        one.call("hhh");

    }

}

