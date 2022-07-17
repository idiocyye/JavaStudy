package day20;

public class Square extends Shape{
    //正方形边长
    private double side;
    //正方形周长
    public  double perimeter(){
        return 4*side;
    }
    //正方形面积
    public  double area(){
        return side*side;
    }
    //无参构造
    public Square() {
    }
    //有参构造

    public Square(String color, boolean fill, double side) {
        super(color, fill);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public  String toString(){
        return "这个正方形的边长为"+side+"周长为"+perimeter()+"面积为"+area()+"正方形是否填充"+isFill()
                +"正方形的颜色是："+getColor();
    }
}
