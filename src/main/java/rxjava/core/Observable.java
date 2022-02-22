package rxjava.core;

/**
 * 被观察者核心抽象类
 * 也是使用框架的入口
 *
 * @author Chris
 * @version 1.0.0
 * @since 2022/02/22
 */
public abstract class Observable<T> implements ObservableSource<T> {
    @Override
    public void subscribe(Observer<T> observer) {
        // 各谁建立订阅
        // 怎么建立订阅
        // 为了保证拓展性，交给开发者实现
        subscribeActual(observer);
    }

    protected abstract void subscribeActual(Observer<T> observer);

    public static <T> Observable<T> create(ObservableOnSubscribe<T> source) {
        return new ObservableCreate<T>(source);
    }
}
