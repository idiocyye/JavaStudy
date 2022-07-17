package day18;
public class Employee {
    private String name;
    private int birthMonth;
    //根据参数月份来确定工资，如果该月员工过生日，则公司会额外奖励100 元。
    public double getSalary(int month){
        if (month!=this.birthMonth){
            return 0.0;
        }else {
            return 100;
        }
    }

    public Employee() {
    }

    public Employee(String name, int birthMonth) {
        this.name = name;
        this.birthMonth = birthMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }
}
