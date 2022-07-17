package course;

import org.junit.Test;

public class Demo02 {
    public static void test01(int X,int Y){
        if (X < 4||Y > 0){
            if (Y>1){
                Y++;
            }
        }else {
            if (X>=5){
                X=X-Y;
            }else {
                X=X+Y;
            }
        }
        System.out.println("X为："+X+" Y为："+Y);
    }
    @Test
    public void test01() {
        test01(3,2);
    }
    @Test
    public void test02() {
        test01(3,1);
    }
    @Test
    public void test03() {
        test01(4,-1);
    }
    @Test
    public void test04() {
        test01(5,-1);
    }
}
