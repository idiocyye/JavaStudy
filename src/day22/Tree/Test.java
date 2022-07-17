package day22.Tree;


public class Test {
    public static void main(String[] args) {
       CanFly flight=new Flight();
       CanFly bird=new Bird();
       flight.fly();
       bird.fly();
       Test test=new Test();
       test.makeFly(flight);
       test.makeFly(bird);
    }
    public void makeFly(CanFly canFly){
        canFly.fly();
    }
}
