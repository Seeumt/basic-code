package Stronger.File类;

import java.io.File;

public class demo01File {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//; 路径分隔符

        String separator = File.separator;
        System.out.println(separator);//    \  路径里面文件名称分隔符

        System.out.println("D:\\basic-code\\day04-code\\src\\cn");
        //其实是一个\的，但是在Java语言里面 \不能单独出现，因为是转移字符
    }
}
