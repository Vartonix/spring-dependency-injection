package pl.dawid.springdependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.dawid.springdependencyinjection.controllers.ConstructorInjectedController;
import pl.dawid.springdependencyinjection.controllers.MyController;
import pl.dawid.springdependencyinjection.controllers.PropertyInjectedController;
import pl.dawid.springdependencyinjection.controllers.SetterInjectedController;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("--- Property ---");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--- Setter ---");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--- Constructor ---");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
