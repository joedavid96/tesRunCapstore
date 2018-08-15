package com.capgemini.capstore.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.capgemini.capstore"})
@EntityScan(basePackages="com.capgemini.capstore.beans")
@EnableJpaRepositories(basePackages="com.capgemini.capstore.daoservices")
public class BootMain extends SpringBootServletInitializer {

	public static void main(String[] args) {
		
		
			SpringApplication.run(BootMain.class, args);
	}
		
		@Override
		protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
			return application.sources(BootMain.class);
		}
		
		
		
	

}
