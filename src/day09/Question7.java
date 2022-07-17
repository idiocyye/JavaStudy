package day09;

/**
 * 一个数如果恰好等于它的因子之和，这个数就是完数，例如 6 = 1 + 2 + 3，编程
 * 找出1000内所有的完数。
 */
public class Question7 {
    public static void main(String[] args) {
        for(int i=1;i<1000;i++){
            int count=0;
            for (int j=1;j<i;j++){
                if(i%j==0){
                    count=count+j;
                }
            }
            if(count==i){
                System.out.println(count);
            }
        }
    }
}
