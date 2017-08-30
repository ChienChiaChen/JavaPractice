package tw.rxjava;


import rx.Observable;
import rx.Observer;
import rx.Subscriber;

public class RxJavaPractice1 {
    public static void main(String[] args) {
        Observer<String> observer = new Observer<String>() {
            @Override
            public void onNext(String s) {
                System.out.println( "Observer Item: " + s);
            }

            @Override
            public void onCompleted() {
                System.out.println( "Observer Completed!");

            }

            @Override
            public void onError(Throwable e) {
                System.out.println( "Observer Error");
            }
        };

        Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onNext(String s) {//onclick1
                System.out.println( "subscriber Item: " + s);
            }

            @Override
            public void onCompleted() {//onclick2
                System.out.println( "subscriber Completed!");
            }

            @Override
            public void onError(Throwable e) {//onclick3
                System.out.println( "subscriber Error");
            }

//            @Override
//            public void onStart() {
//                super.onStart();
//            }
        };


        //Button
//        Case1
//        Observable observable = Observable.create(new Observable.OnSubscribe<String>() {
//            @Override
//            public void call(Subscriber<? super String> subscriber) {
//                subscriber.onNext("Hello");
//                subscriber.onNext("Hi");
//                subscriber.onNext("Aloha");
//                subscriber.onCompleted();
//            }
//        });

        //Button.setOnClickListener
//        observable.subscribe(observer);

//        Case2
//        Observable observable = Observable.just("Hello", "Hi", "Alo");
//        observable.subscribe(observer);

//        Case3
        Observable observable = Observable.from(new String[]{"Hello", "Hi", "Aloha"});
        observable.subscribe(subscriber);
    }
}
