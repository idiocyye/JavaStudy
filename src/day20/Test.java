package day20;

public class Test {
    public static void main(String[] args) {
        Weapon tank=new Tank();
        Weapon flight=new Flighter();
        Weapon warship=new WarShip();
        tank.attack();
        tank.move();
        flight.move();
        flight.attack();
        warship.attack();
        warship.move();
    }
}
