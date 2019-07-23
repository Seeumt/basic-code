package Stronger.序列化流;

import cn.itcast.day04.demo04.Person;

import java.io.*;

/*
ObjectOutputStream:对象的序列化流
作用：把对象以流的方式写入到文件中保存

构造方法：
 */
public class demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\basic-code\\day04-code\\src\\Stronger\\序列化流\\a.txt"));

        oos.writeObject(new Person("迪丽热巴",18));

        oos.close();
    }
}
