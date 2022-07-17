package Algorithm;

import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        String [] strs={"flower","flowr","flowerb"};
        System.out.println(select(strs));
    }
    public static String select(String [] strs){
        if (!checkStr(strs)) {
            return "";
        }
        StringBuilder res=new StringBuilder();
        Arrays.sort(strs);
        System.out.println(strs[0]);
        System.out.println(strs[1]);
        System.out.println(strs[2]);
        int m=strs[0].length();
        int n=strs[strs.length-1].length();
        int num=Math.min(m,n);
        for (int i=0;i<num;i++){
            if (strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                res.append(strs[0].charAt(i));
            }else {
                break;
            }
        }
        return res.toString();
    }
    public static boolean checkStr(String [] strs){
        boolean flag=false;
            for (int i=0;i<strs.length;i++){
                if (strs[i].length()==0|| strs[i] == null){
                    flag=false;
                }else {
                    flag=true;
                }
        }
        return flag;
    }
}
