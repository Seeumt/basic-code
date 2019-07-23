package Stronger.IO流.Reader;

import java.io.FileReader;
import java.io.IOException;
/*
字符输入流的最顶层的父类
FileReader extends InputStreamReader extends Reader
文件字符输入流
 */
public class demo02Reader {
    public static void main(String[] args) throws IOException {
        //构造方法的参数是String name
        //               File file
        FileReader fr = new FileReader("D:\\basic-code\\day04-code\\src\\Stronger\\IO流\\OutPutStream\\b.txt");
        int len = 0;
        while((len=fr.read())!=-1){
            System.out.print((char)len);
        }
        fr.close();
    }
}
