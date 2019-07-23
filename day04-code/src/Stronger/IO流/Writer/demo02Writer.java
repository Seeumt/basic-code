package Stronger.IO流.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
FileWriter extends OutputStreamWriter extends Writer
FileWriter 文件字符输出流
内存中写入文件中
 */
public class demo02Writer {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\basic-code\\day04-code\\src\\Stronger\\IO流\\Writer\\ww.txt");

        char[] cs ={'a','b','c','d'};

        fw.write(cs);

        fw.flush();

        fw.write(cs,1,3);

        fw.close();
    }
}
