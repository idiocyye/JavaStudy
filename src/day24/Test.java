package day24;

import day16.A;

public class Test {
    public static void main(String[] args) {
        Army army=new Army(3);
        Weapon tank=new Tank();
        Weapon plane=new Plane();
        Weapon ship=new Ship();
        army.addWeapon(tank);
        army.addWeapon(plane);
        army.addWeapon(ship);

        army.attackAll();
        army.moveAll();
    }
}
