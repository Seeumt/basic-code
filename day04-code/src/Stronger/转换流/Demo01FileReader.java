package Stronger.转换流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo01FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Admin\\Desktop\\sql\\GBK.txt");
        int len = 0;
        while ((len=fr.read())!=-1){
            System.out.println((char) len);
        }

    }
}
