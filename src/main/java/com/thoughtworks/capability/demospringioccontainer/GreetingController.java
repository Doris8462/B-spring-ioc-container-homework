package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Scope(value = "prototype")
public class GreetingController {

    private  GreetingService greetingService;

    @Lookup
    public GreetingService getGreetingService() {
        return greetingService;
    }

    @GetMapping("/greet")
    public String greet() {
        return getGreetingService().sayHi();
    }

}
