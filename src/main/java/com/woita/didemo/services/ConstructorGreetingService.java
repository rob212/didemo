package com.woita.didemo.services;

import org.springframework.stereotype.Service;

/**
 * @author mcbrydr on 02/08/19
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected via the constructor!!";
    }
}
