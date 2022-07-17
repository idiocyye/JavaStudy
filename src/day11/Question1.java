package day11;
import java.util.Scanner;
/**
 * 编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5
 * 思考：这个方法应该起什么名字，这个方法的形参是什么，方法的返回值类型是什么。
 */
public class Question1 {
    public static int Factorial(int x){
        int sum=0;
        int count=1;
        for (int j=1;j<=x;j++){
                count=count*j;
        }
        sum=sum+count;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        System.out.println(Question1.Factorial(x));
    }
}
