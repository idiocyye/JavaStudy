package day08;

import java.util.Scanner;

/**
 * 整数大小比较：输入两个整数，比较大小，
 * 	若x>y 输出 >
 * 	若x=y 输出 =
 * 	若x<y 输出 <
 */
public class Question4 {
    public static void way(int x,int y){
        if(x>y){
            System.out.println(">");
        }else if(x==y){
            System.out.println("=");
        }else {
            System.out.println("<");
        }
    }
    public static void main(String[] args){
        System .out.println("请输入数字x,y：");
        Scanner s1=new Scanner(System.in);
        int x=s1.nextInt();
        Scanner s2=new Scanner(System.in);
        int y=s2.nextInt();
        way(x,y);
    }
}
