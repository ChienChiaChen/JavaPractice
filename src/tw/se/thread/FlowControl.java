package tw.se.thread;

/**
 * Created by chiachen on 2017/4/19.
 */
public class FlowControl {

//    // Lock for synchronization
//    private Object lock = new Object();
//    // Message to pass
//    private String message = null;

    private Object lock = new Object();
    private String message = null;

    public void produce(String message){
        System.out.println("msg: " + message);

        synchronized (lock) {
            this.message = message;
            lock.notify();
        }

    }

//    public void produce(String message) {
//        System.out.println("produce message: " + message);
//        synchronized (lock) {
//            this.message = message;
//            lock.notify();
//        }
//    }

    public void consume()throws InterruptedException{
        System.out.println("wait for message");
        synchronized (lock) {
            lock.wait();
            System.out.println("consume msg: " + message);
        }

    }

//    public void consume() throws InterruptedException {
//        System.out.println("wait for message");
//        synchronized (lock) {
//            lock.wait();
//            System.out.println("consume message: " + message);
//        }
//    }


    public static void main(String[] args) throws InterruptedException {
        final FlowControl flowControl = new FlowControl();
        new Thread(()->{
            try {
                flowControl.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

//        // Create consumer thread
//        new thread(()->{
//            try {
//                flowControl.consume();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }).start();
//
//        // Sleep for 1 sec
        Thread.sleep(1000);
        new Thread(()->{
            flowControl.produce("eeee");
        }).start();
//
//        // Create producer thread
//        new thread(()->{
//            flowControl.produce("helloworld");
//        }).start();
    }
}
