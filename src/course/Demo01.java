package course;

import java.util.Scanner;

public class Demo01 {
    public void compare(int a,int b){
        int i = a>b?a:b;
        for(;i>0;i--){
            if(a%i==0&&b%i==0){
                System.out.println("a、b的最大公约数为"+i);
                break;
            }
        }
        return;
    }
    public static void main(String[] arg){
        Demo01 demo = new Demo01();
        System.out.println("请输入a：");
        Scanner num1 =new Scanner(System.in);
        int a=num1.nextInt();
        System.out.println("请输入b：");
        Scanner num2 =new Scanner(System.in);
        int b=num2.nextInt();
        demo.compare(a, b);
    }
}
