package day19;

public class Test {
    public static void main(String[] args) {
        Person person=new Person("石昊",20,"男");
        Virus virus=new Virus("Hiv",200.0,"d");
        virus.attack(person);
    }
}
