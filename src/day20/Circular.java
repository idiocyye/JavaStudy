package day20;

public class Circular extends Shape{
    //半径
    private double radius;
    double pi=3.14;
    //周长
    public  double perimeter() {
        return 2*pi*radius;
    }
    //面积
    public  double area() {
        return pi*radius*radius;
    }
    //无参构造
    public Circular() {
    }
    //有参构造
    public Circular(String color, boolean fill, double radius) {
        super(color, fill);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public  String toString() {
        return "这个圆形的半径为"+radius+"周长为"+perimeter()+"面积为"+area()+"圆形是否填充"+isFill()
                +"圆形的颜色是："+getColor();
    }

}
