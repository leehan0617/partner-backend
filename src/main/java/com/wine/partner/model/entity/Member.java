package com.wine.partner.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Member {
    private int id;
    private String userId;
    private String password;
    private Date regDt;
}
