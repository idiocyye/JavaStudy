package day10;

/**
 * 一个四位数，恰好等于去掉它的首位数字之后所剩的三位数的3倍，这个
 * 四位数是多少？
 */
public class Question5 {
    public static void main(String[] args) {
      for(int i=1000;i<=9999;i++){
          int x=i%1000;
          if(3*x==i){
              System.out.println(i);
          }
      }
    }
}
