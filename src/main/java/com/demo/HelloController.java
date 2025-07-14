package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
    public String hello() {
		//hello java
        return "Hello from CI/CD pipeline!";
    }
}
