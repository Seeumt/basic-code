package cn.itcast.day04.May17demo;

import java.util.ArrayList;
import java.util.Random;

public class ArrayList04Random {
    public static void main(String[] args) {
        ArrayList<Integer> list4 = new ArrayList<>();
        Random random = new Random();
//        for (int i = 0; i < 6; i++) {
//            int r=random.nextInt();
//            list4.add(r);
//        }
        for (int i = 0; i < 6; i++) {
            list4.add(random.nextInt());
            System.out.println(list4.get(i));
        }
    }
}
