package day20;

/**
 * (2)设计实现画板类，要求：
 * ①画一个红色、无填充、长和宽分别为10.0与5.0的长方形；
 * ②画一个绿色、有填充、半径为3.0的圆形；
 * ③画一个黄色、无填充、边长为4.0的正方形；
 * ④分别求三个对象的面积和周长，并将每个对象的所有属性信息打印到控制台。
 */
public class Client {
    public static void main(String[] args) {
        Shape rectangle=new Rectangle("红色",false,10.0,5.0);
        Shape circular=new Circular("绿色",true,3.0);
        Shape square=new Square("黄色",false,4.0);

        System.out.println(rectangle.toString());
        System.out.println(circular.toString());
        System.out.println(square.toString());
    }
}
