package Exercise.ThreadTest;

public class ThreadTest02 {
    public static void main(String[] args) {
        Thread thread=new Thread(new MyThread02());
        thread.setName("t1");
        System.out.println(thread.getName());
        thread.start();
        Thread currentThread=Thread.currentThread();
        System.out.println(currentThread);
    }
}
class MyThread02 implements Runnable{

    @Override
    public void run() {
        System.out.println("分支线程");
        Thread currentThread=Thread.currentThread();
        System.out.println(currentThread);
    }
}
