package com.pavao.minhaeiro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Spring é um conjunto de anotações como o seguinte:
@Controller
public class HelloController {
//    Aqui irá os nossos métodos
    @GetMapping("/hello")
    public String hello(){
        return "hello";
        //se não estiver usando Thimeleaf tem que colocar hello.html
//        o thimeleaf já vai direto procurar em templates
    }
}
