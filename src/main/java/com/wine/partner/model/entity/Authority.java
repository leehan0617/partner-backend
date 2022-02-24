package com.wine.partner.model.entity;

import lombok.Data;

@Data
public class Authority {
    private String id;
    private int memberId;
    private String role;
}
