package com.woita.didemo.services;

/**
 * @author mcbrydr on 01/08/19
 */

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {


    public static final String HELLO_GURUS = "Hello Gurus! - Original from greeting service Impl";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }

}
