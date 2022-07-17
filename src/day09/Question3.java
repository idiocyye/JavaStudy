package day09;
import java.util.Scanner;
/**
 * 从控制台输入一个正整数，计算该数的阶乘。例如输入5，阶乘为 5*4*3*2*1
 */
public class Question3 {
    public static void main(String[] args){
        System.out.println("请输入一个正整数：");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int count=1;
        for(int i=1;i<=x;i++){
            count=count*i;
        }
        System.out.println(x+"的阶层为"+count);
    }
}
