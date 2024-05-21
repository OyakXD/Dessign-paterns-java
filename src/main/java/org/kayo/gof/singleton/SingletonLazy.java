package org.kayo.gof.singleton;

/**
 * Singleton "Preguiçoso"
 * @Author OyakXD
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
