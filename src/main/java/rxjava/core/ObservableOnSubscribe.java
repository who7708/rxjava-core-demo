package rxjava.core;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2022/02/22
 */
public interface ObservableOnSubscribe<T> {
    void subscribe(Emitter<T> emitter);
}
