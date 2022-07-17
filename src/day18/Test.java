package day18;

public class Test {
    public static void main(String[] args) {
        System.out.println("拿固定工资的员工");
        SalariedEmployee person1=new SalariedEmployee();
        person1.setMonthSalary(8000);
        person1.setName("陈巧怡");
        person1.setBirthMonth(7);
        System.out.println(person1.getName()+"生日是"+person1.getBirthMonth()+"月");
        System.out.println(person1.getName()+" 平时工资为"+person1.getSalary(6));
        System.out.println(person1.getName()+" 生日月工资为"+person1.getSalary(7));

        System.out.println("小时工");
        HourlyEmployee person2=new HourlyEmployee();
        person2.setHourSalary(30);
        person2.setHour(200);
        person2.setName("赵云");
        person2.setBirthMonth(10);
        System.out.println(person2.getName()+"生日是"+person2.getBirthMonth()+"月");
        System.out.println(person2.getName()+"工作时间为"+person2.getHour()+"小时"+" 每小时工资为"+person2.getHourSalary()+"元");
        System.out.println(person2.getName()+" 平时工资为"+person2.getSalary(6));
        System.out.println(person2.getName()+" 生日月工资为"+person2.getSalary(10));

        System.out.println("销售人员");
        SalesEmployee person3=new SalesEmployee();
        person3.setSalesNum(4000);
        person3.setRoyaltyRate(1.7);
        person3.setName("李白");
        person3.setBirthMonth(9);
        System.out.println(person3.getName()+"生日是"+person3.getBirthMonth()+"月");
        System.out.println(person3.getName()+"销售额为"+person3.getSalesNum()+"元"+" 提成率为"+person3.getRoyaltyRate());
        System.out.println(person3.getName()+" 平时工资为"+person3.getSalary(6));
        System.out.println(person3.getName()+" 生日月工资为"+person3.getSalary(9));

        System.out.println("有底薪的销售人员");
        BasePlusSalesEmployee person4=new BasePlusSalesEmployee();
        person4.setBaseSalary(2000);
        person4.setSalesNum(4000);
        person4.setRoyaltyRate(1.7);
        person4.setName("杜甫");
        person4.setBirthMonth(12);
        System.out.println(person4.getName()+"生日是"+person4.getBirthMonth()+"月");
        System.out.println(person4.getName()+"销售额为"+person4.getSalesNum()+"元"+" 提成率为"+person4.getRoyaltyRate()+" 底薪为"+person4.getBaseSalary()+"元");
        System.out.println(person4.getName()+" 平时工资为"+person4.getSalary(6));
        System.out.println(person4.getName()+" 生日月工资为"+person4.getSalary(12));
    }
}
