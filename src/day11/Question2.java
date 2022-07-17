package day11;

import java.util.Scanner;

/**
 * 编写一个方法，输出大于某个正整数n的最小的质数。
 * 思考：这个方法应该起什么名字，这个方法的形参是什么，方法的返回值类型是什么。
 */
public class Question2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n = s.nextInt();
        int number = n ;
        while(!primenumber(++number)){}
        System.out.println("大于"+n+"的最小质数是"+number);
    }
    public static boolean primenumber(int i){
        for (int x = i - 1;x > 1 ;x-- )
        {
            if (i % x == 0){
                return false;}
        }
        return true;
    }
}
