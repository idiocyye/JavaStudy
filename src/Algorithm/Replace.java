package Algorithm;

public class Replace {
    public static void main(String[] args) {
        String target="We Are Happy";
        System.out.println(target.replace(" ","%20"));
        StringBuffer stb=new StringBuffer(target);
        System.out.println(replace(stb));
    }
    public static String replace(StringBuffer str){
        StringBuffer result=new StringBuffer();
        for (int i=0;i<str.length();i++){
            if (String.valueOf(str.charAt(i)).equals(" ")){
                result.append("%20");
            }else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
