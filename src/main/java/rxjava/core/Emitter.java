package rxjava.core;

/**
 * 事件发射器
 *
 * @author Chris
 * @version 1.0.0
 * @since 2022/02/22
 */
public interface Emitter<T> {

    void onNext(T t);

    void onComplete();

    void onError(Throwable throwable);
}
