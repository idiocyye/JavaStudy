package day09;

import sun.awt.geom.AreaOp;

/**
 * С��������ÿ�����2.5ԪǮ������������������ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5��
 * ����5�ı����Ļ��������Ứȥ6ԪǮ�����ʣ����������죬С���ſ��Դ浽100ԪǮ��
 */
public class Question6 {
    public static void main(String[] args) {
        int day=1;
        double money=0;
        double cost;
        while(money<100){
            money+=2.5;
            day++;
            if (day%5==0){
                cost =6;
                money=money-cost;
            }
        }
        System.out.println(day);
    }
}
