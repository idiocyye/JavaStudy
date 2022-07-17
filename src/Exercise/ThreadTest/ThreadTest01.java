package Exercise.ThreadTest;

public class ThreadTest01 {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        try {
            Thread.sleep(1000*3);
        } catch (InterruptedException e) {
             e.printStackTrace();
        }
        System.out.println("主线程");
        System.out.println(myThread.getPriority());
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("====分支线程");
    }
}
