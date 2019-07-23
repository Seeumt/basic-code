package Stronger.IO流.OutPutStream;
/*
FileOutPutStream(String name,boolean append)
FileOutPutStream(File file,boolean append)
参数：
    Boolean append
    true 创建对象不会覆盖原文件 ，继续在文件末尾追加写
    false 创建新文件覆盖 源文件
    换行 \r\n
            /n
            /r*/

import java.io.FileOutputStream;
import java.io.IOException;

public class demo03OutPutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\basic-code\\day04-code\\src\\Stronger\\IO流\\b.txt");
        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
