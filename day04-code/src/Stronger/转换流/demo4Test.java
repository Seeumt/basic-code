package Stronger.转换流;

import java.io.*;

public class demo4Test {
    public static void main(String[] args) throws IOException {
        convert();
    }

    private static void convert() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\Admin\\Desktop\\sql\\GBK.txt"), "GBK");

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\basic-code\\day04-code\\src\\Stronger\\转换流\\utf8_PLUS.txt"), "UTF-8");


        int len = 0 ;
        while ((len=isr.read())!=-1){
            osw.write((char)len);
        }
        osw.close();
        isr.close();
    }
}
