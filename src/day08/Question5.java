package day08;

import java.util.Scanner;

/**
 * ��д�����ɼ����������������ֱ�������num1,num2,num3�У������ǽ�������
 * ʹ��if-else�ṹ��������С�����˳�����
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
        System .out.println("����������num1,num2,num3��");
        Scanner s1=new Scanner(System.in);
        int num1=s1.nextInt();
        Scanner s2=new Scanner(System.in);
        int num2=s2.nextInt();
        Scanner s3=new Scanner(System.in);
        int num3=s2.nextInt();
        way(num1,num2,num3);
    }
}
