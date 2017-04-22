package tw.se.thread.forkJoinpoolpractice;

import java.util.concurrent.RecursiveTask;

/**
 * Created by chiachen on 2017/4/20.
 */
public class Fibonacci extends RecursiveTask<Integer> {
    final int n;
    Fibonacci(int n) {
        this.n = n;
    }

    @Override
    public Integer compute() {
        if (n <= 1)
            return n;
        Fibonacci f1 = new Fibonacci(n - 1);
        f1.fork();
        Fibonacci f2 = new Fibonacci(n - 2);
        return f1.join() + f2.compute();
    }
}