package day09;
import java.util.Scanner;
/**
 * 给一个不多于5位的正整数，
 * 要求：
 * 一、求它是几位数
 * 二、逆序打印出各位数字
 */
public class Question8 {
    public static void main(String[] args) {
        System.out.println("请输入一个不多于5位的正整数：");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int []a=new int[5];
        int i=0;
        do {
            a[i]=x%10;
            x=x/10;
            i++;
        }while (x!=0);
        System.out.println("这是"+i+"位数");
        System.out.println("从个位起依次是：");
        for (int j=0;j<5;j++){
            System.out.print(a[j]+" ");
        }
    }
}
