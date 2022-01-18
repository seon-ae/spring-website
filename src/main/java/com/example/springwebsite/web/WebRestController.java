package com.example.springwebsite.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {
    @GetMapping("/archives")
    public String archives() {
        return "lg cns";
    }
}
