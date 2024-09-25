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

    // expose a new endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!";
    }

    // expose a new endpoint for "breakfast"

    @GetMapping("/breakfast")
    public String getBreakfast(){
        return "get some sandwiches";
    }
}
