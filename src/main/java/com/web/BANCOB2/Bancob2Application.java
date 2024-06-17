package com.web.BANCOB2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages ="model")
@SpringBootApplication
public class Bancob2Application {

	public static void main(String[] args) {
		SpringApplication.run(Bancob2Application.class, args);
	}

}
