package cn.itcast.day04.May17demo;

import cn.itcast.day04.demo04.Student;

import java.util.ArrayList;

public class ArrayList05Student {
    public static void main(String[] args) {
        ArrayList<Student> list5 = new ArrayList<>();
        Student one = new Student("hh",20);
        Student two = new Student("hhh",21);
        Student three = new Student("hhhh",22);
        Student four = new Student("hhhhh",23);
        list5.add(one);
        list5.add(two);
        list5.add(three);
        list5.add(four);

        //
         for (int i = 0; i < list5.size(); i++) {
                    System.out.println(list5.get(i));
                }
         for (int i = 0; i < list5.size(); i++) {
            System.out.println(list5.get(i).getName()+" "+list5.get(i).getAge());
        }

         for (int i = 0; i < list5.size(); i++) {
             Student stu = list5.get(i);
            System.out.println(stu.getName()+" "+stu.getAge());
        }

    }
}
