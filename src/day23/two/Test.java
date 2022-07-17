package day23.two;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        HotelMg hotelMg=new HotelMg();
        while (true){
            System.out.println("欢迎使用酒店管理系统，请严格按照以下步骤操作：");
            System.out.println("1 查询所有房间信息，2 预定房间,3 退订房间，0 退出系统");
            Scanner s=new Scanner(System.in);
            int i=s.nextInt();
            if (i==1){
                hotelMg.print();
            }else if (i==2){
                System.out.println("请输入房间编号：");
                Scanner s2=new Scanner(System.in);
                int j=s2.nextInt();
                hotelMg.book(j);
                System.out.println("已经预定房间"+j);
            }else if (i==3){
                System.out.println("请输入退订房间编号：");
                Scanner s3=new Scanner(System.in);
                int k=s3.nextInt();
                hotelMg.checkOut(k);
                System.out.println("已经退定房间"+k);
            }else if (i==0){
                System.out.println("退出系统");
                return;
            }else {
                System.out.println("非法输入，请重新输入：");
            }
        }
    }
}
