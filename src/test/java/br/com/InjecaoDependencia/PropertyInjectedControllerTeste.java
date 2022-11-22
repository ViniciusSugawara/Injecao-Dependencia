package br.com.InjecaoDependencia;

import br.com.InjecaoDependencia.controllers.PropertyInjectedController;
import br.com.InjecaoDependencia.services.PrimaryGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyInjectedControllerTeste {

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new PrimaryGreetingService();
    }

    PropertyInjectedController controller;
    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }
}
