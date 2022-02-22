package rxjava.core;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2022/02/22
 */
public interface Observer<T> {
    void onSubscribe();

    void onNext(T t);

    void onComplete();

    void onError(Throwable throwable);
}
