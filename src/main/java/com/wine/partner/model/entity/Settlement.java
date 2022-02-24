package com.wine.partner.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Settlement {
    private int id;
    private Date orderDate;
    private int year;
    private int month;
    private int day;
}
