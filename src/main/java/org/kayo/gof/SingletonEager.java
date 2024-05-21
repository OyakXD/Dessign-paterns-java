package org.kayo.gof;

/**
 * Singleton "Apressado"
 * @Author OyakXD
 */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}

