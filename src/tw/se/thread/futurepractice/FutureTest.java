package tw.se.thread.futurepractice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by chiachen on 2017/4/17.
 * https://www.oschina.net/question/54100_83333
 */
public class FutureTest {
    public static class Task implements Callable<String> {
        @Override
        public String call() throws Exception {
            String tid = String.valueOf(Thread.currentThread().getId());
            System.out.println("thread: in call ");
            return tid;
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Future<String>> results = new ArrayList<>();

        ExecutorService es = Executors.newCachedThreadPool();
        for(int i=0; i<5;i++)
            results.add(es.submit(new Task()));

        for(Future<String> res : results)
            System.out.println(res.get());
    }

}
