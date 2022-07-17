package day16;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car=new Vehicle();
        car.setSpeed(300);
        car.setSize("5吨");
        System.out.println(car.getSpeed()+" "+car.getSize());
        car.speedUp(90);
        System.out.println(car.getSpeed());
        car.speedDown(30);
        System.out.println(car.getSpeed());
    }
}
