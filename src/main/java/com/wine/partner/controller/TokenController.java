package com.wine.partner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/token")
public class TokenController {

    @PostMapping("/token-test")
    public String tokenTest() {
        return "Token Test";
    }

    @GetMapping("/refresh")
    public void refresh() {
    }

    @GetMapping("/access")
    public void access() {

    }
}
