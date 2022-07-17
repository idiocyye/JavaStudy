package day18;

public class BasePlusSalesEmployee extends SalesEmployee{
    private double baseSalary;

    public BasePlusSalesEmployee() {
    }

    public BasePlusSalesEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double getSalary(int month){
        double bonus=super.getSalary(month);
        return baseSalary+bonus;
    }
}
