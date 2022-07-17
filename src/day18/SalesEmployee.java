package day18;

public class SalesEmployee extends Employee{
    private double salesNum;
    private double royaltyRate;

    public SalesEmployee() {
    }

    public SalesEmployee(double salesNum, double royaltyRate) {
        this.salesNum = salesNum;
        this.royaltyRate = royaltyRate;
    }

    public double getSalesNum() {
        return salesNum;
    }

    public void setSalesNum(double salesNum) {
        this.salesNum = salesNum;
    }

    public double getRoyaltyRate() {
        return royaltyRate;
    }

    public void setRoyaltyRate(double royaltyRate) {
        this.royaltyRate = royaltyRate;
    }
    public double getSalary(int month){
        double bonus=super.getSalary(month);
        return salesNum*royaltyRate+bonus;
    }
}
