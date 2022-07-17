package Algorithm;

public class Four {
    public static void main(String[] args) {
        String str="race a car";
        String str1="race a ecar";
        System.out.println(isPalindrome1(str)?"yes":"no");
        System.out.println(isPalindrome2(str1)?"yes":"no");
    }
    public static boolean isPalindrome1(String str){
        if (str==null){
            return false;
        }
        int l=0;
        int r=str.length()-1;
        while (l<r){
            if (Character.isLetterOrDigit(str.charAt(l))&&Character.isLetterOrDigit(str.charAt(r))){
                if (Character.toLowerCase(str.charAt(l))!=Character.toLowerCase(str.charAt(r))){
                    return false;
                }
                l++;
                r--;
            }else {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome2(String str){
        if (str==null){
            return false;
        }
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<str.length();i++){
            stringBuilder.append(str.charAt(i));
        }
        if (!str.equals(stringBuilder.reverse().toString())){
            return false;
        }
        return true;
    }
}
