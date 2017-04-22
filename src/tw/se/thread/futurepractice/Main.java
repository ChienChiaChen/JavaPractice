package tw.se.thread.futurepractice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * Created by chiachen on 2017/4/16.
 */
public class Main {
    public static void main(String[] args) {
//        Client client = new Client();
//        // 这里会立即返回，因为得到的是FutureData而不是RealData
//        Data data = client.request("name");
//        System.out.println("请求完毕");
//        try {
//            // 这里可以用一个sleep代替了对其他业务逻辑的处理
//            // 在处理这些业务逻辑的过程中，RealData被创建，从而充分利用了等待时间
//            thread.sleep(2000);
//        } catch (InterruptedException e) {
//        }
//        // 使用真实的数据
//        System.out.println("数据 = " + data.getResult());


        // 构造FutureTask
        FutureTask<String> future = new FutureTask<>(new RealData1("a"));
        ExecutorService executor = Executors.newFixedThreadPool(1);

        // 执行FutureTask，相当于上例中的 client.request("a") 发送请求
        // 在这里开启线程进行RealData的call()执行
        executor.submit(future);
        System.out.println("请求完毕");
        try {
            // 这里依然可以做额外的数据操作，这里使用sleep代替其他业务逻辑的处理
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        // 相当于data.getResult ()，取得call()方法的返回值
        // 如果此时call()方法没有执行完成，则依然会等待
        try {
            System.out.println("数据 = " + future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


//        ExecutorService executor = Executors.newFixedThreadPool(1);
//        // 执行FutureTask，相当于上例中的 client.request("a") 发送请求
//        // 在这里开启线程进行RealData的call()执行
//        Future<String> future = executor.submit(new RealData1("a"));
//        System.out.println("请求完毕");
//        try {
//            // 这里依然可以做额外的数据操作，这里使用sleep代替其他业务逻辑的处理
//            thread.sleep(2000);
//        } catch (InterruptedException e) {
//        }
//        // 相当于data.getResult ()，取得call()方法的返回值
//        // 如果此时call()方法没有执行完成，则依然会等待
//
//        try {
//            System.out.println("数据 = " + future.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
    }
}
