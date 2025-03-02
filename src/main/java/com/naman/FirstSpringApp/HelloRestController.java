package com.naman.FirstSpringApp;

import org.springframework.web.bind.annotation.*;
import com.naman.FirstSpringApp.User;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    @RequestMapping(value = { "", "/", "/home" })
    public String sayHello() {
        return "Hello from BridgeLabz!";
    }

}