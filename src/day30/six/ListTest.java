package day30.six;

import java.util.*;

/**
 * 6.定义一个泛型为String类型的List集合，统计该集合中每个字符
 * （注意，不是字符串）出现的次数。例如：集合中有”abc”、”bcd”两个元素，
 * 程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("abc");
        list.add("bcd");
        method(list);

    }
    public static void method(List<String> list){
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i=0;i<list.size();i++){
            String str=list.get(i);
            char[] c=str.toCharArray();
            for (int j=0;j<c.length;j++){
                if (hashMap.containsKey(c[j])){
                    hashMap.put(c[j],hashMap.get(c[j])+1);
                }else {
                    hashMap.put(c[j],1);
                }
            }
        }
        System.out.println(hashMap);
    }
}
