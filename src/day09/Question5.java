package day09;
import java.util.Scanner;
/**
 * 从键盘接收一个正整数，该正整数作为行数，输出以下图形
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 * 例如：输入5，则打印如上图5行。
 */
public class Question5 {
    public static void main(String[] args){
        System.out.println("请输入一个正整数：");
        Scanner s=new Scanner(System .in);
        int x=s.nextInt();
        //控制输出行数
        for(int i=1;i<=x;i++){
            //每行空格数为行数减去i，打印空格
            for(int j=1;j<=x-i;j++){
                System.out.print(" ");
            }
            //每行星号为2i-1，打印星号
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            //打印完一行，换行
            System.out.println();
        }
    }
}
