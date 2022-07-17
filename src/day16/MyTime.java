package day16;

/**
 * 在程序中经常要对时间进行操作但是并没有时间类型的数据。
 * 那么我们可以自己实现一个时间类来满足程序中的需要。
 * 定义名为MyTime的类其中应有三个整型成员时hour分minute秒second
 * 为了保证数据的安全性这三个成员变量声应明为私有。
 * 为MyTime类定义构造方法以方便创建对象时初始化成员变量。
 * 再定义diaplay方法用于将时间信息打印出来。
 * 为MyTime类添加以下方法
 * 	addSecond(int sec)
 * 	addMinute(int min)
 * 	addHour(int hou)
 * 	subSecond(int sec)
 * 	subMinute(int min)
 * 	subHour(int hou)
 * 分别对时、分、秒进行加减运算。
 */
public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void display(){
        System.out.println(hour+"时"+minute+"分"+second+"秒");
    }
    public void addSecond(int sec){
        int min=(this.second+sec)/60;
        this.second=(second+sec)%60;
        this.addMinute(min);
    }
    public void addMinute(int min){
        int hou=(this.minute+min)/60;
        this.minute=(minute+min)%60;
        this.addHour(hou);
    }
    public void addHour(int hou){
        this.hour=(hour+hou)%24;
    }

    public void subHour(int hou){
        this.hour=(hour-hou)%24;
        if(hour<0){
            this.hour=24+hour;
        }
    }
    public void subMinute(int min){
        if(this.minute>min){
            this.minute=minute-min;
        }else {
            int hou=(min-this.minute)/60+1;
            this.minute=60-(min-this.minute)%60;
            this.subHour(hou);
        }
    }
    public void subSecond(int sec){
        if(this.second>sec){
            this.second=second-sec;
        }else {
            int min=(sec-this.second)/60+1;
            this.second=60-(sec-this.second)%60;
            this.subMinute(min);
        }
    }
}
