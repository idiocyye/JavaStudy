package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class day01 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }else {
                map.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("数组中不存在这样的两个数");
    }
}
