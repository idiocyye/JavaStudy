package day10;

/**
 * ��Ŀ������ 1! + 2! + 3! + 4! +... + 10!
 * 	˵����4! ��ʾ4�Ľ׳ˡ�4�Ľ׳��ǣ�1 * 2 * 3 * 4
 */
public class Question3 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=10;i++){
            int count=1;
            for (int j=1;j<=i;j++){
                count=count*j;
            }
            sum=sum+count;
        }
        System.out.println(sum);
    }
}
