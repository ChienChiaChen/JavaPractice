package tw.se.thread.forkJoinpoolpractice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

/**
 * Created by chiachen on 2017/4/20.
 */
public class Main  {
    public static void main(String[] args) throws InterruptedException,ExecutionException{
        Fibonacci fibonacci = new Fibonacci(10);
        ForkJoinPool.commonPool().execute(fibonacci);
        System.out.println(fibonacci.get());
    }
}
