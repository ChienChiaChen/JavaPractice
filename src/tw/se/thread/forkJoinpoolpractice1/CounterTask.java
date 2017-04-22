package tw.se.thread.forkJoinpoolpractice1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * Created by chiachen on 2017/4/22.
 */
public class CounterTask extends RecursiveTask<Integer> {
    private int start, end;
    public final static int boundary = 2;
    CounterTask counterTask1, counterTask2;

    public CounterTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;

        boolean isOver = (end-start) >= boundary;

        if (isOver) {
            int middle = (start + end)/2;
            counterTask1 = new CounterTask(start, middle);
            counterTask1.fork();
            counterTask2 = new CounterTask(middle + 1, end);
            counterTask2.fork();
            sum = counterTask1.join() + counterTask2.join();
        }else {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
//        int result = new CounterTask(1, 4).compute();

        Future<Integer> result = forkJoinPool.submit(new CounterTask(1, 11000));
        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
