package com.wine.partner.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private String id;
    private int memberId;
    private int settlementId;
    private String orderType;
    private String customerName;
    private String customerBirth;
    private String customerPhone;
    private String wineName;
    private int perPrice;
    private int supplyPrice;
    private int amount;
    private String regDtStr;
    private Date regDt;
}
