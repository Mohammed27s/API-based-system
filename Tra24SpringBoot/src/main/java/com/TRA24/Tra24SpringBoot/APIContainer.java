package com.TRA24.Tra24SpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIContainer {

    @GetMapping("Hi")

    public String login() {
        return "Welcome to the Login page";
    }
}
