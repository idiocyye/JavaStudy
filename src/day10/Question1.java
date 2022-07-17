package day10;

import java.util.Scanner;

/**
 * 题目：一个5位数，判断它是不是回文数。即12321是回文数，
 * 个位与万位相同，十位与千位相同
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个五位数：");
        int x=s.nextInt();
        int []a=new int[5];
        for (int i=0;i<5;i++){
            a[i]=x%10;
            x=x/10;
        }
        if(a[0]==a[4]&&a[1]==a[3]){
            System.out.println("这是一个回文数");
        }else {
            System.out.println("这不是回文数");
        }
    }
}
