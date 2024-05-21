package org.kayo.gof;

import org.kayo.gof.facade.Facade;
import org.kayo.gof.singleton.SingletonEager;
import org.kayo.gof.singleton.SingletonLazy;
import org.kayo.gof.singleton.SingletonLazyHolder;
import org.kayo.gof.strategy.*;

public class Main {
    public static void main(String[] args) {

        // Singleton Pattern

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        // Pular linha
        System.out.println();

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        // Pular linha
        System.out.println();

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        // Strategy Pattern

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();

        // Facade Pattern

        Facade facade = new Facade();
        facade.migrarCliente("João", "12345678");

    }
}