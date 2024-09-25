package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties for: coach.name and team.name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for "teaminfo"

    @GetMapping("/team.info")
    public String getTeamInfo(){
        return " Coach:" + coachName + " Team name:" + teamName;
    }

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
