package day24;

public class Tank extends Weapon implements Attack,Move {
    @Override

    public void attack() {
        System.out.println("坦克攻击");
    }

    @Override
    public void move() {
        System.out.println("坦克移动");
    }
}
