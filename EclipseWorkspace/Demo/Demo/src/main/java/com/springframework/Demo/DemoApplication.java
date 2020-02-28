package com.springframework.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springframework.controllers.GreetController;
import com.springframework.services.HelloWorldFactory;
import com.sprinkgframework.config.HelloConfig;

@SpringBootApplication
@ComponentScan (basePackages = {"com.springframework"})
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		GreetController controller =(GreetController) ctx.getBean("greetController");
		controller.sayHello();
		
		AnnotationConfigApplicationContext annCtx = new AnnotationConfigApplicationContext();
		annCtx.register(HelloConfig.class);
		annCtx.refresh();
		HelloConfig config = annCtx.getBean("helloConfig",HelloConfig.class);
		config.helloWorldServiceEnglish(new HelloWorldFactory());
		annCtx.close();
	}

}
