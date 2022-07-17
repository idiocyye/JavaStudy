package day16;

public class Person {
    private String name;
    private String age;

    public Person() {
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("姓名："+name+" "+"年龄："+age);
    }
    public static void main(String[] args) {
        Person person=new Person("陈巧怡","21");
        person.display();
    }
}
