package com.caleb.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    //@GetMapping lets Spring know that this is an endpoint at path /hello
    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "Hello Caleb!";
    }

}
