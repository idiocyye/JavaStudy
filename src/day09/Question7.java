package day09;

/**
 * һ�������ǡ�õ�����������֮�ͣ�������������������� 6 = 1 + 2 + 3�����
 * �ҳ�1000�����е�������
 */
public class Question7 {
    public static void main(String[] args) {
        for(int i=1;i<1000;i++){
            int count=0;
            for (int j=1;j<i;j++){
                if(i%j==0){
                    count=count+j;
                }
            }
            if(count==i){
                System.out.println(count);
            }
        }
    }
}
