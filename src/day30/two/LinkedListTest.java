package day30.two;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 2.已知数组存放一批QQ号码，QQ号码最长为11位，最短为5位
 * String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
 * 将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。
 */
public class LinkedListTest {
    public static void main(String[] args) {
        String[] str = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList<String > list=new LinkedList<>();
        for (int i=0;i<str.length;i++){
            list.add(str[i]);
        }
        System.out.println(list+"+++++++");
        int index=0;
        while (index<list.size()){
            for (int i=1;i<list.size();i++){
//                System.out.println(list.get(index)+"====>list.get(index)");
//                System.out.println(list.get(i)+"====>list.get(i)");
                if (index!=i){
                    if (list.get(index).equals(list.get(i))){
                        list.remove(i);
                    }
                }

            }
            index++;

        }

        Iterator<String > it=list.iterator();
       while (it.hasNext()){
           Object obj=it.next();
           System.out.println(obj);
       }
        System.out.println("=============");
       for (String linkedList:list){
           System.out.println(linkedList);
       }
    }
}
