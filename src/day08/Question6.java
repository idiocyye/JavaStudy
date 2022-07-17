package day08;
import java.util.Scanner;
/**
 * 打车起步价8元（3KM以内）
 * 超过3KM，超出的每公里1.2元
 * 超过5KM，超出的每公里1.5元
 * 请在键盘上接收公里数，得出总价。
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
        System .out.println("请输入公里数mile：");
        Scanner s=new Scanner(System.in);
        double  mile=s.nextDouble();
        way(mile);
    }
}
