package tw.rxjava.__1;


import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Client {
    public static void main(String[] args) {//ObservableOnSubscribe
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> observableEmitter) throws Exception {
//                void onNext(@NonNull T var1);
//                void onError(@NonNull Throwable var1);
//                void onComplete();

                System.out.println("1 Go");
                observableEmitter.onNext(1);
                System.out.println("2 Go");
                observableEmitter.onNext(2);
                System.out.println("3 Go");
                observableEmitter.onNext(3);
                System.out.println("4 Go");
                observableEmitter.onNext(4);
                observableEmitter.onComplete();
            }
        }).subscribe(new Observer<Integer>() {
            int i =0;
            Disposable mDisposable;

            @Override
            public void onSubscribe(Disposable disposable) {
                mDisposable = disposable;
            }

            @Override
            public void onNext(Integer integer) {
                i++;
                if (i == 2) {
                    this.mDisposable.dispose();
                }
                System.out.println(integer);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("Complete");
            }
        });

    }
}
