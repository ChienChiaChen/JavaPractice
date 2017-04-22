package tw.se.thread;

/**
 * Created by chiachen on 2017/2/12.
 */
public class test2 {
    public static void main(String[] args) throws  InterruptedException{
        MyThread1 thread=new MyThread1();
        thread.start();
        Thread.sleep(3000);
        thread.interrupt();
    }
}
 class MyThread1 extends Thread {
    int i=0;
    @Override
    public void run() {
        while (true) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("中断异常被捕获了");
                return;
            }
            i++;
        }
    }
}