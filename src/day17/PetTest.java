package day17;

public class PetTest {
    public static void main(String[] args) {
        Master master=new Master();
        Pet dog=new Dog();
        Pet yingwu=new YingWu();
        Pet cat=new Cat();
        master.feed(dog);
        master.feed(yingwu);
        master.feed(cat);
    }
}
