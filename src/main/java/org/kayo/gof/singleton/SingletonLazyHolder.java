package org.kayo.gof.singleton;

/**
 * Singleton "Lazy Holder"
 *
 * @see <a href="http://stackoverflow.com/a/24018148">Referencia</a>
 *
 * @Author OyakXD
 */
public class SingletonLazyHolder {

    private static class InstanceHolder{

    private static SingletonLazyHolder instance = new SingletonLazyHolder();

    }

    private SingletonLazyHolder() {
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }
}
