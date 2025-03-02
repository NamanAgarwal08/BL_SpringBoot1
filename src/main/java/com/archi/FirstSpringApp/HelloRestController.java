package com.archi.FirstSpringApp;

import org.springframework.web.bind.annotation.*;
import com.archi.FirstSpringApp.User;
@RestController
@RequestMapping("/hello")
public class HelloRestController {
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello from BridgeLabz!";
    }

}