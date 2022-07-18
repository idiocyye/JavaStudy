package Algorithm;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(way1(11));
        System.out.println(way2(100));
        System.out.println(way3(11));
    }
    //递归
    public static int way1(int n){
        if (n<=0){
            return 0;
        }
        if (n==1||n==2){
            return 1;
        }
        return way1(n-1)+way1(n-2);
    }
    //迭代
    public static BigInteger way2(int n){
        if (n<=0){
            return new BigInteger("0");
        }
        if (n==1||n==2){
            return new BigInteger("1");
        }
        BigInteger first = new BigInteger("1");
        BigInteger second = new BigInteger("1");
        BigInteger third = new BigInteger("0");
        for (int i = 3; i <=n; i++) {
            third = first.add(second);
            first = second;
            second = third;
        }
        return third;
    }
    //动态规划
    public static int way3(int n){
        if (n<=0){
            return 0;
        }
        if (n==1||n==2){
            return 1;
        }
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        map.put(2,1);
        if (map.containsKey(n)){
            return map.get(n);
        }else {
            map.put(n,way3(n-1)+way3(n-2));
            return map.get(n);
        }
    }
}
