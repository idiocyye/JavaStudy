package day08;

import java.util.Scanner;

/**
 * ������С�Ƚϣ����������������Ƚϴ�С��
 * 	��x>y ��� >
 * 	��x=y ��� =
 * 	��x<y ��� <
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
        System .out.println("����������x,y��");
        Scanner s1=new Scanner(System.in);
        int x=s1.nextInt();
        Scanner s2=new Scanner(System.in);
        int y=s2.nextInt();
        way(x,y);
    }
}
