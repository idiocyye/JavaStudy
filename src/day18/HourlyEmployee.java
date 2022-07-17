package day18;

public class HourlyEmployee extends Employee {
    //属性
    private double hourSalary;
    private int hour;
    //无参构造
    public HourlyEmployee() {
    }
    //有参构造
    public HourlyEmployee(double hourSalary, int hour) {
        this.hourSalary = hourSalary;
        this.hour = hour;
    }
    //get and set方法
    public double getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(double hourSalary) {
        this.hourSalary = hourSalary;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    //方法
    public double getSalary(int month) {
        double bonus = super.getSalary(month);
        if (hour <= 160) {
            return hour * hourSalary + bonus;
        } else {
            return (hour - 160) * 1.5 * hourSalary + 160 * hourSalary + bonus;
        }
    }
}
