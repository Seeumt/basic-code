package Stronger.转换流;

import java.io.*;

/*
字符转化为字节 把能看懂的变成看不懂的
 */
public class Demo03InputStreamReader {
    public static void main(String[] args) throws IOException {
        reader_utf_8();
    }

    private static void reader_utf_8() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\basic-code\\day04-code\\src\\Stronger\\转换流\\utf8.txt"), "utf-8");
        int len = 0 ;
        while ((len=isr.read())!=-1){
            System.out.println((char)len);
        }

        isr.close();



    }
}
