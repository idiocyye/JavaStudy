package day08;
import java.util.Scanner;
/**
 * ���𲽼�8Ԫ��3KM���ڣ�
 * ����3KM��������ÿ����1.2Ԫ
 * ����5KM��������ÿ����1.5Ԫ
 * ���ڼ����Ͻ��չ��������ó��ܼۡ�
 */
public class Question6 {
    public static void way(double mile){
        double price=8.0;
        if(mile<=3){
            System.out.println(price);
        }else if(mile>3&&mile<=5){
            price=price+1.2*(mile-3);
            System.out.println(price);
            }else if(mile>5){
            price=price+1.2*(mile-3)+1.5*(mile-5);
            System .out.println(price);
        }
    }
    public static void main(String[] args){
        System .out.println("�����빫����mile��");
        Scanner s=new Scanner(System.in);
        double  mile=s.nextDouble();
        way(mile);
    }
}
