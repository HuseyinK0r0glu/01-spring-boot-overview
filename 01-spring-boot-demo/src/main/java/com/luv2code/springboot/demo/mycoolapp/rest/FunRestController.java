package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" return "Hello World"

    @GetMapping
    public String sayHelloWorld() {
        return "Hello World";
    }
}
