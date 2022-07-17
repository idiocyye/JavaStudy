package day09;
import java.util.Scanner;
/**
 * 从控制台接收一个正整数，判断该数字是否为质数
 * 质数（质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数）
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
        System.out.println("请输入一个正整数：");
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
        System.out.println("和为"+count2);
    }
}
