package com.example.finalSpringRadwane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.finalSpringRadwane.controller","com.example.finalSpringRadwane.entity","com.example.finalSpringRadwane.repository","com.example.finalSpringRadwane.service","com.example.finalSpringRadwane.util"})
public class FinalSpringRadwaneApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalSpringRadwaneApplication.class, args);
	}

}
