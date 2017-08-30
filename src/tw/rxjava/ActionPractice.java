package tw.rxjava;


import rx.Observable;
import rx.functions.Action0;
import rx.functions.Action1;

public class ActionPractice {
    public static void main(String[] args) {
        Action1<String> onNextAction = new Action1<String>() {
            @Override
            public void call(String s) {
                System.out.println("onNextAction: " + s);
            }
        };

        Action1<Throwable> onErrorAction = new Action1<Throwable>() {
            // onError()
            @Override
            public void call(Throwable throwable) {
                // Error handling
            }
        };

        Action0 onCompletedAction = new Action0() {
            // onCompleted()
            @Override
            public void call() {
                System.out.println("onCompletedAction ");
            }
        };

        Observable observable = Observable.just("Test1", "Test2", "Test3");

//        observable.subscribe(onNextAction);
//        observable.subscribe(onNextAction, onErrorAction);
        observable.subscribe(onNextAction, onErrorAction, onCompletedAction);
    }
}
