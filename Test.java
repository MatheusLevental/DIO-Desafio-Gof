package com.dio.DesafioGof;

import com.dio.DesafioGof.Facade.Facade;
import com.dio.DesafioGof.Singleton.SingletonEager;
import com.dio.DesafioGof.Singleton.SingletonLazy;
import com.dio.DesafioGof.Singleton.SingletonLazyHolder;
import com.dio.DesafioGof.Strategy.Comportamento;
import com.dio.DesafioGof.Strategy.ComportamentoAgressivo;
import com.dio.DesafioGof.Strategy.ComportamentoDefensivo;
import com.dio.DesafioGof.Strategy.ComportamentoNormal;
import com.dio.DesafioGof.Strategy.Robo;

public class Test {

    public static void main(String[] args) {

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14801788");
    }

}
