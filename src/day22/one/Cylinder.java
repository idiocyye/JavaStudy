package day22.one;

/**
 * 第一题：
 * （1）定义接口A，里面包含值为3.14的常量PI和抽象方法double area()。
 * （2）定义接口B，里面包含抽象方法void setColor(String c)。
 * （3）定义接口C，该接口继承了接口A和B，里面包含抽象方法void volume()。
 * （4）定义圆柱体类Cylinder实现接口C，该类中包含三个成员变量：底圆半径radius、
 * 圆柱体的高height、颜色color。
 * （5）创建主类来测试类Cylinder。
 */
public class Cylinder implements C{
    private double radius;
    private double height;
    private String  color;

    public Cylinder() {
    }

    public Cylinder(double radius, double height, String  color) {
        this.radius = radius;
        this.height = height;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void volume() {
        System.out.println(area()*height);
    }

    @Override
    public double area() {
        return PI*radius*radius;
    }

    @Override
    public void setColor(String c) {
        this.color=c;
    }
    public String  toString(){
        return "底面半径"+radius+"高"+height+"颜色"+color;
    }
}
