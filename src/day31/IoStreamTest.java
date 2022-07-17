package day31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IoStreamTest {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("src\\nn.java");
            byte[] bytes=new byte[fis.available()];
//            int readCount=0;
//            while ((readCount=fis.read(bytes))!=-1){
//                System.out.print(new String(bytes,0,readCount));
//            }
            int readCount=fis.read(bytes);
            System.out.print(new String(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
