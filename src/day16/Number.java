package day16;

/**
 * 编写Java程序模拟简单的计算器。
 * 定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。
 * 编写构造方法赋予n1和n2初始值
 * 再为该类定义加addition()、减subtration()、乘multiplication()、除ivision()等公有实例方法
 * 分别对两个成员变量执行加、减、乘、除的运算。
 */
public class Number {
    private int n1;
    private int n2;

    public Number() {
    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public int addition(int n1,int n2){
        this.n1=n1;
        this.n2=n2;
        return n1+n2;
    }
    public int subtration(int n1,int n2){
        return n1+n2;
    }
    public int multiplication(int n1,int n2){
        return n1*n2;
    }
    public int ivision(int n1,int n2){
        return n1/n2;
    }

    public static void main(String[] args) {
        Number number=new Number(10,20);
        System.out.println(number.addition(number.n1,number.n2));
        System.out.println(number.subtration(number.n1,number.n2));
        System.out.println(number.multiplication(number.n1,number.n2));
        System.out.println(number.ivision(number.n1,number.n2));
    }
}
