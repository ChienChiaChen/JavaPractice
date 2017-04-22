package tw.se.thread;

/**
 * Created by chiachen on 2017/4/15.
 */
public class InterruptPractice {
    public static void main(String[] args) {
        MyTestThread myTestThread= new MyTestThread();
       myTestThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myTestThread.interrupt();
    }


}
class  MyTestThread extends Thread{
    @Override
    public void run() {

        while(true){
            if (Thread.currentThread().isInterrupted()) {
                System.out.println(" is Interrupted");
                break;
            }
//            System.out.println("yield");
//            thread.yield();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("thread was interrupted when sleep");
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println(" aaa is Interrupted");
                }else {
                    Thread.currentThread().interrupt();
                    System.out.println(" bbb is not Interrupted");
                }
            }
        }
    }
}