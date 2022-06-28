package pl.dawid.springdependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.dawid.springdependencyinjection.services.GreetingService;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
