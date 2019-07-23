package Stronger.序列化流;

import cn.itcast.day04.demo04.Person;

import java.io.*;

/*
ObjectInputStream:对象的序列化流
作用：把文件中保存的对象，以流的方式读取出来使用

构造方法：
 */
public class demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\basic-code\\day04-code\\src\\Stronger\\序列化流\\a.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
        Person p = (Person)o;
    }
}
