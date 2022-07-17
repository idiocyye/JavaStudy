package day26;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        //引用随机数组对象
        Random random=new Random();
        int index=0;//数组下标
        //创建数组存储随机数
        int[] randomNum=new int[5];
        //初始化整个数组
        for (int j=0;j<randomNum.length;j++){
            randomNum[j]=-1;
        }

        //生成随机数组

        while (index<randomNum.length){
            int num=random.nextInt(101);
            //判断，如果产生的随机数在当前数组不存在（用judge方法判断），则把随机数存入
                if (judge(randomNum,num)){
                    randomNum[index]=num;
                    index++;//存入一个随机数，下标自增1
                }
            }
        //遍历数组打印出来
        for (int k=0;k<randomNum.length;k++){
            System.out.println(randomNum[k]);
        }
    }
    //judge方法，判断产生的随机数是否存在于数组
    public static boolean judge(int[] randomNum,int key){
        for (int i=0;i<randomNum.length;i++){
            if (randomNum[i]==key) return false;
        }
        return true;
    }
}
