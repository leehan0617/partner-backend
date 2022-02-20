package com.wine.partner.model.entity;

import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class User {
    private int id;
    private String userId;
    private String password;
    private boolean activate;
    private Date regDt;
    private Set<Authority> authorities;
}
