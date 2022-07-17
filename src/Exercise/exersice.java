package Exercise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class exersice {
    public static void main(String msg) {
        try {
            PrintStream out=new PrintStream(new FileOutputStream("src\\log",true));
            System.setOut(out);
            Date nowTime=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH/mm/ss/SSS");
            String str=sdf.format(nowTime);
            System.out.println(str+" "+msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
