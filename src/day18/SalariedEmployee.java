package day18;

public class SalariedEmployee extends Employee{
    private double monthSalary;

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public SalariedEmployee() {
    }

    public SalariedEmployee(double monthSalary) {
        this.monthSalary = monthSalary;
    }
    public double getSalary(int month){
        double bonus=super.getSalary(month);
        return monthSalary+bonus;
    }
}
