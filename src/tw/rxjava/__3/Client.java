package tw.rxjava.__3;

import io.reactivex.*;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) {
//        map();
        flatMap();
    }

    private static void flatMap() {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                emitter.onNext(1);
                emitter.onNext(2);
                emitter.onNext(3);
            }
        }).flatMap(new Function<Integer, ObservableSource<String>>() {
            @Override
            public ObservableSource<String> apply(Integer integer) throws Exception {
                final List<String> list = new ArrayList<>();
                for (int i = 0; i < 3; i++) {
                    list.add("I am value " + integer);
                }
                return Observable.fromIterable(list).delay(10,TimeUnit.MILLISECONDS);
            }
        }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                System.out.println(s);
            }
        });


    }

    private static void map() {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> observableEmitter) throws Exception {

                observableEmitter.onNext(1);
                observableEmitter.onNext(2);
                observableEmitter.onNext(3);
                observableEmitter.onNext(4);
            }
        }).map(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) throws Exception {
                return "Result is " + integer;
            }
        }).subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable disposable) {

            }

            @Override
            public void onNext(String s) {
                System.out.println(s);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        });
    }
}
