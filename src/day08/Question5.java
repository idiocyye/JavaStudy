package day08;

import java.util.Scanner;

/**
 * 编写程序，由键盘输入三个整数分别存入变量num1,num2,num3中，对它们进行排序，
 * 使用if-else结构，并按从小到大的顺序输出
 */
public class Question5 {
    public static void way(int num1,int num2,int num3){
        if(num1<num2&&num2<num3){
            System.out.println(num1+","+num2 +","+num3);
        }else if(num1<num3&&num3<num2){
            System.out.println(num1+","+num3 +","+num2);
        }else if(num2<num1&&num1<num3){
            System.out.println(num2+","+num1 +","+num3);
        }else if(num2<num3&&num3<num1){
        }else if(num3<num1&&num1<num2){
            System.out.println(num3+","+num1 +","+num2);
        }else if(num3<num2&&num1<num1){
            System.out.println(num3+","+num2 +","+num1);
        }
    }
    public static void main(String[] args){
        System .out.println("请输入数字num1,num2,num3：");
        Scanner s1=new Scanner(System.in);
        int num1=s1.nextInt();
        Scanner s2=new Scanner(System.in);
        int num2=s2.nextInt();
        Scanner s3=new Scanner(System.in);
        int num3=s2.nextInt();
        way(num1,num2,num3);
    }
}
