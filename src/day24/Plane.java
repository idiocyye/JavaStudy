package day24;

public class Plane extends Weapon implements Attack,Move{
    @Override
    public void attack() {
        System.out.println("飞机攻击");
    }

    @Override
    public void move() {
        System.out.println("飞机移动");
    }
}
