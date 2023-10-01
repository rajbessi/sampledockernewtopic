package com.example.devopsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//--- controls the webservice with Rest client
public class DevopsprojectApplication {

	@GetMapping("/welcome")
	String welcomemessage(){
		return "Hi welcome to the code world";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsprojectApplication.class, args);
	}

}
