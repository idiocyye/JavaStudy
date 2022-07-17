package day20;

public class Rectangle extends Shape{
    //长
    private double length;
    private double width;
    //宽
    public  double perimeter(){
        return 2*length+2*width;
    }
    public  double area(){
        return length*width;
    }

    public Rectangle() {
    }

    public Rectangle(String color, boolean fill, double length, double width) {
        super(color, fill);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public  String toString(){
        return "这个长方形的长为"+length+"宽为"+width+"周长为"+perimeter()+"面积为"+area()+"长方形是否填充"+isFill()
                +"长方形的颜色是："+getColor();
    }
}
