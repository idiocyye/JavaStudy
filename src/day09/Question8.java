package day09;
import java.util.Scanner;
/**
 * ��һ��������5λ����������
 * Ҫ��
 * һ�������Ǽ�λ��
 * ���������ӡ����λ����
 */
public class Question8 {
    public static void main(String[] args) {
        System.out.println("������һ��������5λ����������");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int []a=new int[5];
        int i=0;
        do {
            a[i]=x%10;
            x=x/10;
            i++;
        }while (x!=0);
        System.out.println("����"+i+"λ��");
        System.out.println("�Ӹ�λ�������ǣ�");
        for (int j=0;j<5;j++){
            System.out.print(a[j]+" ");
        }
    }
}
