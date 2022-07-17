package day10;

/**
 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半再落下，
 * 求它在第10次落地时，共经过多少米
 */
public class Question4 {
    public static void main(String[] args) {
        double count=0;
        double s=100;
        for(int i=1;i<=10;i++){
            count=count+1.5*s;
            s=0.5*s;
        }
        count=count-s;
        System.out.println(count);
    }
}
