package day09;
import java.util.Scanner;
/**
 * �ӿ���̨����һ������������������Ľ׳ˡ���������5���׳�Ϊ 5*4*3*2*1
 */
public class Question3 {
    public static void main(String[] args){
        System.out.println("������һ����������");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int count=1;
        for(int i=1;i<=x;i++){
            count=count*i;
        }
        System.out.println(x+"�Ľײ�Ϊ"+count);
    }
}
