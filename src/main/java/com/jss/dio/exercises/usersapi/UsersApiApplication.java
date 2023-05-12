package com.jss.dio.exercises.usersapi;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UsersApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersApiApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI(){
		return new OpenAPI()
				.components(new Components())
				.info(new Info()
						.title("Users-API")
						.description("Este é um Desafio do Bootcamp Dio")
						.license(new License().name("Apache 2.0").url("http://springdoc.org"))
						.contact(new Contact().name("Jozadaque Sousa").url("http://meusite.com").email("jozadaque@rmail.com"))
						.version("1.0")
						.summary("Este é um Desafio do Bootcamp Dio")

				);
	}


}
