package day09;
import java.util.Scanner;
/**
 * �ӿ���̨����һ�����������жϸ������Ƿ�Ϊ����
 * ������������ָ�ڴ���1����Ȼ���У�����1�����������ⲻ����������������Ȼ����
 */
public class Question4 {
    public static int zhishu(int a,boolean count){
        for(int i=2;i<a;i++){
            if(a%i!=0){
                count=true;
            }else {
                count=false;
                break;
            }
        }
        if (count==true){
            return a;
        }else return 0;
    }
    public static void main(String[] args){
        System.out.println("������һ����������");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        boolean count = false;
        int count2=2;
        for (int j=3;j<=x;j++){
            count2+=zhishu(j,count);
        }
        if (x==1){
            count2=0;
        }else if(x==2){
            count2=2;
        }
        System.out.println("��Ϊ"+count2);
    }
}
