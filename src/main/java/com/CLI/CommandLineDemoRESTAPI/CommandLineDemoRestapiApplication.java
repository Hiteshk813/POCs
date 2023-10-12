package com.CLI.CommandLineDemoRESTAPI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class CommandLineDemoRestapiApplication {

//	@Bean
//	public Controller controller(){
//		return new Controller();
//	}

	public static void main(String[] args) {


		SpringApplication.run(CommandLineDemoRestapiApplication.class, args);


	}


}
