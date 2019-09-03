package com.woita.didemo.services;

import org.springframework.stereotype.Component;

/**
 * @author mcbrydr on 16/08/19
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {
        return "Primärer Grußienst";
    }
}
