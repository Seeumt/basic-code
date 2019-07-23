package Stronger.IO流.OutPutStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * OutPutStream 此抽象类是表示输出字节流的所有类的超类
 * 定义了一些字类共性的成员方法
 *
 *
 * ============             FileOutPutStream 往文件里写数据的一个流 把内存中的数据写到硬盘中
 *
 * 构造方法：
 * 参数有String name
 *         File file
 *         构造方法的作用
 *         1.创建一个fileOutPutStream对象
 *         2.会根据构造方法中传递的文件/文件路径，创建一个空的文件
 *         3.会把FileOutputStream对象指向创建好的文件
 */
public class demo01OutPutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\basic-code\\day04-code\\src\\Stronger\\IO流\\a.txt");

        fos.write(88);

        fos.close();
    }
}
