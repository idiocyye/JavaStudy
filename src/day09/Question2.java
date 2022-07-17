package day09;

/**
 * 计算 1+2-3+4-5+6-7....+100的结果
 */
public class Question2 {
    public static void main(String[] args){
        int m=0;
        int n=0;
        for(int i=2;i<=100;i++){
            if(i%2==0){
                m=m+i;
            }else{
                n=n+i;
            }
        }
        System.out.println(1+m-n);
    }
}
