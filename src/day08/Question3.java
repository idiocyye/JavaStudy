package day08;
import java.util.Scanner;
/**
 * 从键盘接收一个数字，判断该数字的奇偶。
 *
 */
public class Question3 {
    public static void way(int x){
        if(x%2==0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }
    public static void main(String[] args){
        System .out.println("请输入数字：");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        way(x);
    }
}
