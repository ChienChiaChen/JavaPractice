package tw.se.thread;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by chiachen on 2017/4/19.
 * https://popcornylu.gitbooks.io/java_multithread/content/sync/message_passing.html
 */
public class LinkedBlockingQueuePractice {
    private LinkedBlockingQueue queue = new LinkedBlockingQueue<>(5);

    public void produce(String message) throws InterruptedException {
        System.out.println("produce message: " + message);
        queue.put(message);
    }

    public void consume() throws InterruptedException {
        System.out.println("consume message: " + queue.take());
    }


    public static void main(String[] args) throws InterruptedException {
        final LinkedBlockingQueuePractice producerConsumer = new LinkedBlockingQueuePractice();

        // Create consumer thread
        new Thread(()->{
            Random random = new Random();
            try {
                while (true) {
                    producerConsumer.consume();
                    Thread.sleep(random.nextInt(1000));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


        // Create producer thread
        new Thread(()->{
            Random random = new Random();
            try {
                int counter = 0;
                while (counter<20) {
                    producerConsumer.produce("message " + counter++);
                    Thread.sleep(random.nextInt(1000));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
