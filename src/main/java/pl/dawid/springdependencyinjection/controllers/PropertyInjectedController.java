package pl.dawid.springdependencyinjection.controllers;

import pl.dawid.springdependencyinjection.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
