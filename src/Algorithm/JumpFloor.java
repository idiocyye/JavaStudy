package Algorithm;

public class JumpFloor {
    public static void main(String[] args) {
        System.out.println(jumpFloor(4));
    }
    public static int jumpFloor(int n){
        if (n<=0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        int first=1,second=2,third=0;
        for (int i=3;i<=n;i++){
            third=first+second;
            first=second;
            second=third;
        }
        return third;
    }
}
