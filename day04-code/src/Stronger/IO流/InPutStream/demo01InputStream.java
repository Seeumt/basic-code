package Stronger.IO流.InPutStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 硬盘>>>>内存
 */
public class demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\basic-code\\day04-code\\src\\Stronger\\IO流\\OutPutStream\\b.txt");
        int read = fis.read();
        System.out.println(read);
        fis.close();
    }
}
