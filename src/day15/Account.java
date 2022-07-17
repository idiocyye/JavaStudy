package day15;

/**
 * 二、写一个名为Account的类模拟账户。
 * 该类的属性和方法如下所示。
 * 该类包括的属性：账户id，余额balance，年利率annualInterestRate；
 * 包含的方法：各属性的set和get方法。取款方法withdraw()，存款方法deposit()
 */
public class Account {
    private String name;
    private String id;
    private double balance;//余额
    private double annualInterestRate;//年利率

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account() {
    }

    public Account(String name,String id, double balance, double annualInterestRate) {
        this .name=name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    //取款方法withdraw()
    public void withdraw(double account){
        if (account>=balance){
            System.out.println("余额不足,取款失败");
        }else {
            balance=balance-account;
            System.out.println("您已经成功取款:"+account+"元"+"此时账户余额为:"+balance+"元");
        }
    }
    // 存款方法deposit()
    public void deposit(double account){
        balance=balance+account;
        System.out.println("您已经成功存款:"+account+"元"+"此时账户余额为:"+balance+"元");
    }
}
