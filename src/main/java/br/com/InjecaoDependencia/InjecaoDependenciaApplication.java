package br.com.InjecaoDependencia;

import br.com.InjecaoDependencia.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InjecaoDependenciaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(InjecaoDependenciaApplication.class, args);
		MyController myController = (MyController) context.getBean("myController");

		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.sayGreeting());

		System.out.println("------- Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("------ Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- Constructor" );
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}
}
