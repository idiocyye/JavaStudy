package day16;

import java.util.Scanner;

/**
 * 1、猜数字游戏
 * 一个类A有一个实例变量v，从键盘接收一个正整数作为实例变量v的初始值。
 * 另外再定义一个类B，对A类的实例变量v进行猜测。
 * 	如果大了则提示大了
 * 	小了则提示小了
 * 	等于则提示猜测成功
 */
public class A {
    private int v;

    public A() {
    }

    public A(int v) {
        this.v = v;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}
 class B {
    private A a;

     public B() {
     }

     public B(A a) {
         this.a = a;
     }

     public A getA() {
         return a;
     }

     public void setA(A a) {
         this.a = a;
     }
     public void caice(int x){
             if (x > a.getV()) {
                 System.out.println("大了哦");
             } else if (x < a.getV()) {
                 System.out.println("小了哦");
             } else {
                 System.out.println("猜对喽");
                 System.exit(0);
             }
     }
     public static void main(String[] args) {
        A a=new A(555);
        B b=new B(a);
        System.out.println("请输入你猜测的数：");
        Scanner s1=new Scanner(System.in);
        int x=s1.nextInt();
        b.caice(x);

    }
}
