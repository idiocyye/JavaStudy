package day24;

import java.text.SimpleDateFormat;
import java.util.Date;

public class T {
    public static void main(String[] args) {
//        String s="acvv";
//        System.out.println("adfg".compareTo(s));
        Date date=new Date();
        SimpleDateFormat sl=new SimpleDateFormat("yyyy/MM/dd/HH/mm/ss/SSS");
        String nowTime=sl.format(date);
        System.out.println(nowTime);
        System.out.println(System.currentTimeMillis());
    }
}
