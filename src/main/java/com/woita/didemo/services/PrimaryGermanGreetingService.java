package com.woita.didemo.services;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author mcbrydr on 02/08/19
 */
public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    @Autowired
    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return this.greetingRepository.getGermanGreeting();
    }
}
