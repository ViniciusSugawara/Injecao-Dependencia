package br.com.InjecaoDependencia.services;

public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from the primary bean";
    }
}
