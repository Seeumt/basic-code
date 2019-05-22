package cn.itcast.day04.May2001demo;

import java.util.ArrayList;

public class Redpackage04 {
    public static void main(String[] args) {
        Manager02 manager02 = new Manager02("群主",100);

        Member03 one = new Member03("成员A",0);
        Member03 two = new Member03("成员B",0);
        Member03 three = new Member03("成员C",0);


        ArrayList<Integer> list =manager02.send(50,3);
        one.recevie(list);
        two.recevie(list);
        three.recevie(list);

        manager02.show();
        one.show();
        two.show();
        three.show();
    }
}
