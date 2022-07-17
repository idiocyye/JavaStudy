package course02;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HotelMg {
    private String loginNo;
    private String realName;
    private int loginPwd;
    private int reLoginPwd;
    private int birthDay;
    public static void login(String loginNo,String realName,int loginPwd,int reLoginPwd,int birthDay){
            Pattern pattern1=Pattern.compile("[0-9]{6,10}");
            Pattern pattern2=Pattern.compile("[A-z]");
            if (pattern1.matcher(loginNo).matches()){
                System.out.println("用户名正确");
            }else {
                System.out.println("用户名错误");
            }

            if (pattern2.matcher(realName).matches()){
                System.out.println("真实姓名输入正确");
            }else {
                System.out.println("真实姓名输入错误");
            }

            if (loginPwd==reLoginPwd){
                System.out.println("密码正确");
            }else {
                System.out.println("密码错误");
            }

            if (birthDay>=1900&&birthDay<=2010){
                System.out.println("生日日期正确");
            }else {
                System.out.println("生日日期错误");
            }
    }
    public static void main(String[] args) {
        while (true){
            Scanner s=new Scanner(System.in);
            System.out.println("输入用户名（用户名为6～10位自然数）：");
            String loginNo=s.nextLine();
            System.out.println("输入用户真实姓名（大小写的英文字符）：");
            String realName=s.nextLine();
            System.out.println("输入用户密码：");
            int loginPwd=s.nextInt();
            System.out.println("确认密码（正整数）：");
            int reLoginPwd=s.nextInt();
            System.out.println("生日日期：");
            int birthDay=s.nextInt();
            login(loginNo,realName,loginPwd,reLoginPwd,birthDay);
        }
    }
}
