package br.com.InjecaoDependencia.services;

public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from constructor";
    }
}
