package Stronger.Properties;

import java.util.Properties;
import java.util.Set;

public class demo01Properties {

    public static void main(String[] args) {

      show02();
      show01();

    }

    private static void show02() {
        //load方法用字节流的话，不能读取 中文
    }

    private static void show01() {

        Properties prop = new Properties();//泛型不用写了，默认就是字符串
        prop.setProperty("kobe","198");
        prop.setProperty("james","203");
        prop.setProperty("durant","213");


        //遍历
        //使用stringPropertyNames把Properties集合中的键取出，存储到一个set集合中
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            System.out.println(key+":"+prop.getProperty(key));
        }
    }
}
