package day16;

public class MyTimeTest {
    public static void main(String[] args) {
        MyTime myTime=new MyTime(9,5,35);
        myTime.display();
        myTime.addHour(20);
        myTime.display();
        myTime.addSecond(60);
        myTime.display();
        myTime.addMinute(60);
        myTime.display();
        System.out.println("\n");
        myTime.subHour(23);
        myTime.display();
        myTime.subMinute(3);
        myTime.display();
        myTime.subSecond(6);
        myTime.display();
    }
}
