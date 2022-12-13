package br.com.InjecaoDependencia.services;

public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from setter";
    }
}
