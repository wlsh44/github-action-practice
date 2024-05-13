package com.example.cicd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @Value("${branch}")
    private String branch;

    @GetMapping("")
    public String branch() {
        return branch;
    }
}
