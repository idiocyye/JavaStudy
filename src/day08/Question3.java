package day08;
import java.util.Scanner;
/**
 * �Ӽ��̽���һ�����֣��жϸ����ֵ���ż��
 *
 */
public class Question3 {
    public static void way(int x){
        if(x%2==0){
            System.out.println("ż��");
        }else {
            System.out.println("����");
        }
    }
    public static void main(String[] args){
        System .out.println("���������֣�");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        way(x);
    }
}
