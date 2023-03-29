package com.example.Spring_IO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringIoApplication.class, args);

		State_Config state_Config = context.getBean(State_Config.class);

		state_Config.setState_Name("Tamilnadu");

		System.out.println(state_Config.getState_Name());

		state_Config.state_Info();

	}

}
