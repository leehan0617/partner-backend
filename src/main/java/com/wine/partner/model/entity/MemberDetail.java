package com.wine.partner.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="member_detail")
public class MemberDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "member_id")
    private int memberId;
    private String name;
    private String region;
    @Column(name = "phone_number")
    private String phoneNumber;
    private String address;
    @Column(name = "detail_address")
    private String detailAddress;
    @Column(name = "zip_code")
    private String zipCode;
    @Column(name = "operating_time")
    private String operatingTime;
    @Column(name = "pickup_time")
    private String pickupTime;
    private String holiday;
    @Column(name = "temp_holiday")
    private String tempHoliday;
    @Column(name = "bank_name")
    private String bankName;
    @Column(name = "account_name")
    private String accountName;
    @Column(name = "account_number")
    private String accountNumber;
}
