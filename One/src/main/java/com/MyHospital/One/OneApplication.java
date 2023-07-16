package com.MyHospital.One;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableJpaRepositories("com.MyHospital.One.*")
@ComponentScan(basePackages = { "com.MyHospital.One.*" })
@EntityScan("com.MyHospital.One.*")   
public class OneApplication {
	
	@RequestMapping("/home")
	public String home() {
		return "Hi welcome here";
	}

	public static void main(String[] args) {
		SpringApplication.run(OneApplication.class, args);
	}

}
