package com.jss.dio.exercises.usersapi.controllers;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomePageController {

    @GetMapping
    public  String home(){
        return "<H1>Bem Vindo ao Desafio DIO</H2>" +
                "Esta é um Desafio do Bootcamp Dio\n que simula o retorno da página <a href=\"https://jsonplaceholder.typicode.com/users\">https://jsonplaceholder.typicode.com/users</a>." +
                "<br/>Utilize a página  <a href=\"http://localhost:8080/users\">http://localhost:8080/users</a> para mais visualizar os usuários cadastrados."+
                "<br/>Utilize a página de documentação swagger em <a href=\"http://localhost:8080/swagger-ui/index.html\">http://localhost:8080/swagger-ui/index.html</a> para mais informações";
    }
}
