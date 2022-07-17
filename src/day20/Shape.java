package day20;

/**
 * ①抽象类图形类中有属性包括画笔颜色(String类型)、图形是否填充(boolean类型：true表示填充，
 * false表示不填充)，
 * 有方法获取图形面积、获取图形周长等；
 * ②使用构造方法为其属性赋初值；
 * ③在每个子类中都重写toString()方法，返回所有属性的信息；
 * ④根据文字描述合理设计子类的其他属性和方法。
 */
public abstract class Shape {
    //颜色，填充
    private String color;
    private boolean fill;
    //获取图形面积，周长，toString方法
    public abstract double perimeter();
    public abstract double area();
    public abstract String toString();

    public Shape() {
    }

    public Shape(String color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }
}
