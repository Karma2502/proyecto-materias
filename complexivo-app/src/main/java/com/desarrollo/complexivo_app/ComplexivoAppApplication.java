package com.desarrollo.complexivo_app;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ComplexivoAppApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(ComplexivoAppApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		BCryptPasswordEncoder bCrypt = new BCryptPasswordEncoder();
		System.out.println("Password: "+bCrypt.encode("20032004"));
	}
}
