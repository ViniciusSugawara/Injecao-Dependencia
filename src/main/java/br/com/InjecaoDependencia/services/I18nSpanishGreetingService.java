package br.com.InjecaoDependencia.services;

public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello español";
    }
}
