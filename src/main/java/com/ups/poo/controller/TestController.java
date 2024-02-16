package com.ups.poo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name,
                        @RequestParam String lastname,
                        @RequestParam (required = false) Integer age){
        String message = "This is my first SpringBootProject!, and my name is: " + name + " " + lastname;
        if(age != null) {
            message = message + " and my age is: " + age;
        }
        return message;
    }

    @GetMapping("/concat-2")
    public String concatenate(@RequestParam String name,
                              @RequestParam (required = false) String lastname,
                              @RequestParam (required = false) Integer age){
        String message = "This is my first SpringBootProject, my name is: " + name;

        if (lastname != null) {
            return message = message + "my last name is " + lastname;
        }
        if (age != null){
            return message = message + " and my age is " + age;
        }
        return message;
    }
    /*@GetMapping("/concat/{name}/{lastname}")
    public String pollofrito1(@PathVariable String name, @PathVariable String lastname) {
        return "This is my second rest service!, and my name is: "
                + name + " " + lastname;
    }
    */
    @GetMapping("/purple/{name}/{lastname}/{age}")
    public String purple(@PathVariable String name,
                              @PathVariable (required = false) String lastname,
                              @PathVariable (required = false) Integer age) {
        String message = "This is my first SpringBootProject, my name is: " + name;

        if (lastname != null) {
            message = message + " my last name is " + lastname;
        }
        if (age != null){
            message = message + " and my age is " + age;
        }
    return message;
    }
}
