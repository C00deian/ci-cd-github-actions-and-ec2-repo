package com.demo.ci_cd_github_actions_and_ec2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcomePage() {
        return "Welcome to Production! The CI/CD Pipelines is working!";
    }
}
