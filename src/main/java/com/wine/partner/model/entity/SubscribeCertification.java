package com.wine.partner.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class SubscribeCertification {
    private int id;
    private int memberId;
    private String customerInfo;
    private Date regDt;
}
