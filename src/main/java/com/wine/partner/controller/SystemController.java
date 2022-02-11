package com.wine.partner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemController {

    @GetMapping("/")
    public String healthCheck() {
        return "HELLO";
    }
}
