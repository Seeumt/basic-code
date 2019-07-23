package Stronger.IO流.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
FileWriter extends OutputStreamWriter extends Writer
FileWriter 文件字符输出流
内存中写入文件中
 */
public class demo01Writer {
    /*
    构造方法 也是 String name
                    File file

     */
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\basic-code\\day04-code\\src\\Stronger\\IO流\\Writer\\w.txt");
        fw.write(97);
        fw.flush();//先把数据写到内存缓冲区（字节转换为字节的过程）//把写好的数据刷新进去
        fw.close();//先是刷新功能，然后通知系统释放资源，流对象不可以再使用了
    }
}
