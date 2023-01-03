package com.vinsloev.accelerator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping(method = RequestMethod.GET, path = "/getHello")
    public HelloOutput HelloWorld() {
        return new HelloOutput("Java Accelerator", "Hello from Application");
    }

}
