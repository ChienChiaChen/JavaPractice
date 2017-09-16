package tw.rxjava.rxjava2_1;


import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class main {
    public static void main(String[] args) {
        Observable<Integer> observable = Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                emitter.onNext(1);
                emitter.onNext(2);
                emitter.onNext(3);
                emitter.onComplete();
            }
        });
        Observer<Integer> observer=new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable disposable) {
                System.out.println("Subscribe");
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("Next: "+integer);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error");
            }

            @Override
            public void onComplete() {
                System.out.println("Complete");
            }
        };

        observable.subscribe(observer);

    }
}
