package com.micro.ibm.app;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.micro.ibm.app.model.Event;
import com.micro.ibm.app.model.EventRepositary;

@SpringBootApplication
public class ProductMicroApplication {

	@Autowired
	private EventRepositary repo;

	private static Logger log = LoggerFactory.getLogger(ProductMicroApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProductMicroApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ApplicationContext ctx) { // ServletContext
		return args -> {
			/*
			 * String beans[] = ctx.getBeanDefinitionNames(); int ctr =1; String allbeans
			 * =""; for(String bean:beans) { allbeans += "\n"+ ctr++ +" "+bean; }
			 * log.debug("\n\n "+allbeans);
			 */

			Event e = new Event(1, "hi", UUID.randomUUID().toString(), new Date());
			repo.save(e);
		};
	}
}
