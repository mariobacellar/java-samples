package com.agenciamacro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.agenciamacro.service.BusService;

@SpringBootApplication
public class BusApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusApiApplication.class, args);
	}


	/**
	 * It is generally considered best practice to put exposed beans in configuration classes, which are logically grouped.
	 * For example, you might have several configuration classes with a number of beans contained within each. 
	 * Here we create the bean in Main class just for simplicity
	 */
	@Bean
	public BusService busService() {
		return new BusService();
	}


}
