package day24;

public class Ship extends Weapon implements Move{

    @Override
    public void move() {
        System.out.println("船移动");
    }
}
