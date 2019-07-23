package Stronger.转换流;

import java.io.*;

/*
字符转化为字节 把能看懂的变成看不懂的
 */
public class Demo02OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        write_utf_8();
    }

    private static void write_utf_8() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\basic-code\\day04-code\\src\\Stronger\\转换流\\utf8.txt"), "UTF-8");
        osw.write("你好");
        osw.flush();
        osw.close();


    }
}
