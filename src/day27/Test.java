package day27;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        while (true){
            UserService userService=new UserService();
            System.out.println("请输入用户名：");
            Scanner s1=new Scanner(System.in);
            String username=s1.next();
            System.out.println("请输入用户密码：");
            Scanner s2=new Scanner(System.in);
            String password=s2.next();
            try {
                userService.register(username,password);
            }catch (RegisterException r){
                r.printStackTrace();
            }
        }
    }
}
