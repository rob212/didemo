package com.woita.didemo.controllers;

import com.woita.didemo.services.GreetingService;
import com.woita.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author mcbrydr on 01/08/19
 */
@Controller
public class PropertyInjectedController {


    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }
}
