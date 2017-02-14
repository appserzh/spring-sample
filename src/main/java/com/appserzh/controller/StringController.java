package com.appserzh.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/string_controller",
                produces = MediaType.APPLICATION_JSON_VALUE)
public class StringController {

    @RequestMapping(path = "/say_hello", method = RequestMethod.GET)
    public String sayHello() {
        return "say hello";
    }
}
