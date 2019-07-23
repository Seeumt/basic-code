package Stronger.File类;

import java.io.File;

/**
 * isDirectory()
 *  路径不存在都返回false
 * isFile()
 */
public class demo04File {
    public static void main(String[] args) {
        File f1 = new File("D:\\basic-code\\day04-code\\src\\Stronger\\demo04File.java");
        File f2 = new File("D:\\basic-code\\day04-code\\src\\Stronger\\demo04File.javvvva");
        boolean exists1 = f1.exists();
        System.out.println(exists1);
        boolean exists2 = f2.exists();
        System.out.println(exists2);

    }
}
