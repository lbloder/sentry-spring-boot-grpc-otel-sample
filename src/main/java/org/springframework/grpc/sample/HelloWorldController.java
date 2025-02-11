package org.springframework.grpc.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelloWorldController {

    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }
}
