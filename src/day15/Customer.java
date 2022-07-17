package day15;

public class Customer {
    public static void main(String[] args) {
        Account account=new Account("Jane Smith","1000",2000,0.0123);
        account.deposit(100);
        account.withdraw(960);
        account.withdraw(2000);

    }
}
