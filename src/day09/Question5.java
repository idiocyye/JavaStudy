package day09;
import java.util.Scanner;
/**
 * �Ӽ��̽���һ��������������������Ϊ�������������ͼ��
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 * ���磺����5�����ӡ����ͼ5�С�
 */
public class Question5 {
    public static void main(String[] args){
        System.out.println("������һ����������");
        Scanner s=new Scanner(System .in);
        int x=s.nextInt();
        //�����������
        for(int i=1;i<=x;i++){
            //ÿ�пո���Ϊ������ȥi����ӡ�ո�
            for(int j=1;j<=x-i;j++){
                System.out.print(" ");
            }
            //ÿ���Ǻ�Ϊ2i-1����ӡ�Ǻ�
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            //��ӡ��һ�У�����
            System.out.println();
        }
    }
}
