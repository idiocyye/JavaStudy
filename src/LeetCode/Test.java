package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] array={1,2,9,5,11};
        for (int i:operateArray(array)){
            System.out.println(i);
        }
    }
    private static int[] operateArray(int[] array){
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<array.length;i++){
            list.add(array[i]);
        }
        int max=list.get(0);
        for (int i=1;i<list.size();i++){
            if (max<=list.get(i)){
                max=list.get(i);
            }
        }
        List<Integer> list1=new ArrayList<>();
        for (int j=0;j<=max;j++){
            list1.add(j);
            for (int i=0;i<list.size();i++){
                if (list1.get(i)==list.get(i)){
                    list1.remove(i);
                }
            }
        }
        int[] newArray=new int[max];
        for (int i=0;i<list1.size();i++){
            newArray[i]=list1.get(i);
        }
        return newArray;
    }
}
