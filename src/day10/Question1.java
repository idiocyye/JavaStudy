package day10;

import java.util.Scanner;

/**
 * ��Ŀ��һ��5λ�����ж����ǲ��ǻ���������12321�ǻ�������
 * ��λ����λ��ͬ��ʮλ��ǧλ��ͬ
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("������һ����λ����");
        int x=s.nextInt();
        int []a=new int[5];
        for (int i=0;i<5;i++){
            a[i]=x%10;
            x=x/10;
        }
        if(a[0]==a[4]&&a[1]==a[3]){
            System.out.println("����һ��������");
        }else {
            System.out.println("�ⲻ�ǻ�����");
        }
    }
}
