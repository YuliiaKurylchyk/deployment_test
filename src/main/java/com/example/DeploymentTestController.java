package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeploymentTestController {

    @GetMapping("/deployment-test")
    public String getDeploymentTest() {
        return "Working...";
    }
}
