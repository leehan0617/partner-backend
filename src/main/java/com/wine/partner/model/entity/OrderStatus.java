package com.wine.partner.model.entity;

import lombok.Data;

@Data
public class OrderStatus {
    private int id;
    private String orderId;
    private String statusCode;
    private String agentName;
    private String agentBirth;
}
