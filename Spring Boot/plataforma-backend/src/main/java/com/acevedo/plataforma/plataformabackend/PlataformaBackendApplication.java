package com.acevedo.plataforma.plataformabackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlataformaBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlataformaBackendApplication.class, args).getBeanDefinitionNames();
	}

}
