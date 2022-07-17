package day30.one;

import java.util.*;

/**
 *1.产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
 */
public class Randoms {
    public static void main(String[] args) {
        Random random=new Random();
        int[] randomNum=new int[10];
        //初始化数组
        for (int i=0;i<randomNum.length;i++){
            randomNum[i]=-1;
        }

        //生成随机数组
        int index=0;
        while (index<randomNum.length){
            int num=random.nextInt(101);
            if (judge(randomNum,num)){
                randomNum[index]=num;
                index++;
            }
        }
        System.out.println("这个数组为:");
        //遍历随机数组
        for (int i=0;i<randomNum.length;i++){
            System.out.println(randomNum[i]);
        }
        System.out.println("这个数组中大于等于10的元素有:");
        List<Integer> list=new ArrayList<>(10);
        for (int i=0;i<randomNum.length;i++){
            if (randomNum[i]>=10){
                list.add(randomNum[i]);
            }
        }
        //迭代器对list集合进行迭代，打印出来
        Iterator it=list.iterator();
        while (it.hasNext()){
           Object num=it.next();
            System.out.println(num);
        }
    }

//判断数组中是否已经有这个元素
    public static boolean judge(int[] randomNum,int key) {
        for (int i = 0; i < randomNum.length; i++) {
            if (randomNum[i] == key || key < 1) return false;
        }
        return true;
    }
}
