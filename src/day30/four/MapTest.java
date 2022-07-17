package day30.four;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 4. 现在有一个map集合如下：
 * Map<Integer,String> map = new HashMap<Integer, String>();
 * map.put(1, "张三丰");
 * map.put(2, "周芷若");
 * map.put(3, "汪峰");
 * map.put(4, "灭绝师太");
 * 要求：
 * 	1.遍历集合，并将序号与对应人名打印。
 * 	2.向该map集合中插入一个编码为5姓名为郭靖的信息
 * 	3.移除该map中的编号为1的信息
 * 	4.将map集合中编号为2的姓名信息修改为"周林"
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        Set<Integer> key=map.keySet();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
        Iterator<Integer> it=key.iterator();
        while (it.hasNext()){
            Integer o=it.next();
            System.out.println(o+":"+map.get(o));
        }
        System.out.println("=============================================");
        for (Integer integer:key){
            System.out.println(integer+":"+map.get(integer));
        }
        System.out.println("=============================================");
        Set<Map.Entry<Integer,String >> set=map.entrySet();
        Iterator<Map.Entry<Integer,String >> iterator=set.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String > node=iterator.next();
            System.out.println(node.getKey()+":"+node.getValue());
        }
        System.out.println("=============================================");
        for ( Map.Entry<Integer,String > m:set){
            System.out.println(m.getKey()+";"+m.getValue());
        }
        System.out.println("=============================================");
        map.put(5,"郭靖");
        map.remove(1);
        map.replace(2,"周林");
        Set<Map.Entry<Integer,String >> set1=map.entrySet();
        Iterator<Map.Entry<Integer,String >> ite=set1.iterator();
        while (ite.hasNext()){
            Map.Entry<Integer,String > node=ite.next();
            System.out.println(node.getKey()+":"+node.getValue());
        }
    }
}
