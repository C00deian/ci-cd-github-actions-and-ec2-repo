package com.demo.ci_cd_github_actions_and_ec2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello-world")
    public String index() {
        return "Hello World";
    }
}
