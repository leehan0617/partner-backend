package com.wine.partner.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity webSecurity) {
        // security 를 적용하지 않을 path
//        webSecurity.ignoring()
//                .antMatchers("");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // api중 security 를 적용하지 않을 path
        http.authorizeRequests()
            .antMatchers("/", "login").permitAll()
            .anyRequest().authenticated();
    }

}
