package com.wine.partner.model.entity;

import lombok.Data;

@Data
public class MemberDetail {
    private int id;
    private int memberId;
    private String name;
    private String region;
    private String phoneNumber;
    private String address;
    private String detailAddress;
    private String zipCode;
    private String operatingTime;
    private String pickupTime;
    private String holiday;
    private String tempHoliday;
    private String bankName;
    private String accountName;
    private String accountNumber;
}
