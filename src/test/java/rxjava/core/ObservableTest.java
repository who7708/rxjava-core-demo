package rxjava.core;

import org.junit.jupiter.api.Test;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2022/02/22
 */
public class ObservableTest {
    @Test
    public void test1() {
        System.out.println("===== test1 =====");
        Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(Emitter<String> emitter) {
                System.out.println("subscribe");
                emitter.onNext("aaa");
                emitter.onNext("bbb");
                emitter.onNext("ccc");
                emitter.onComplete();
                emitter.onError(new Throwable("error"));
            }
        }).subscribe(new Observer<String>() {
            @Override
            public void onSubscribe() {
                System.out.println("onSubscribe");
            }

            @Override
            public void onNext(String s) {
                System.out.println("onNext");
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError");
            }
        });
    }
}