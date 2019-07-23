package Generic;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 泛型主要应用于集合
 *
 * 在编译时就可以防范错误
 *
 */
public class Genericdemo01 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");


        for (Object item : list) {
            System.out.println(item);
        }

        ArrayList<String> s = new ArrayList<>();
        s.add("a");
        s.add("b");
        s.add("c");
        System.out.println(s);
        for (Object s1 : s) {
            System.out.println(s1);
        }

    }
}
