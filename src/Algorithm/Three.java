package Algorithm;

import java.util.HashSet;
import java.util.Set;

public class Three {
    public static void main(String[] args) {
        String strs="abccccdd";
        System.out.println(longestPalindrome(strs));
    }
    public static int longestPalindrome(String str){
        if (str==null){
            return 0;
        }
        char [] chars=str.toCharArray();
        Set<Character> set=new HashSet<>();
        int count=0;
        for (int i=0;i<chars.length;i++){
            if (!set.contains(chars[i])){
                set.add(chars[i]);
            }else {
                set.remove(chars[i]);
                count++;

            }
        }
        return set.isEmpty()?count*2:count*2+1;
    }
}
