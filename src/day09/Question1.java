package day09;

/**
 * ����1000�������в��ܱ�7����������֮��
 */
public class Question1 {
    public static void main(String[] args){
        int count=0;
        for (int i=0;i<=1000;i++){
            if(i%7!=0){
                count=count+i;
            }
        }
        System.out.println(count);
    }
}
