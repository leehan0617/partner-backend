package com.wine.partner.model.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wine.partner.model.entity.Member;
import com.wine.partner.model.entity.MemberDetail;
import lombok.Getter;

import java.util.Date;

@Getter
public class MemberRequest {
    private String userId;
    private String password;
    private String name;
    private String region;
    private String phoneNumber;
    private String address;
    private String detailAddress;
    private String zipCode;
    private String operationTime;
    private String holiday;
    private String tempHoliday;
    private String pickupTime;
    private String bankName;
    private String accountName;
    private String accountNumber;

    @JsonIgnore
    public Member getMember() {
        Member member = new Member();
        member.setUserId(userId);
        member.setPassword(password);
        member.setRegDt(new Date());
        return member;
    }

    @JsonIgnore
    public MemberDetail getMemberDetail() {
        MemberDetail memberDetail = new MemberDetail();
        memberDetail.setName(name);
        memberDetail.setRegion(region);
        memberDetail.setAddress(address);
        memberDetail.setDetailAddress(detailAddress);
        memberDetail.setPhoneNumber(phoneNumber);
        memberDetail.setZipCode(zipCode);
        memberDetail.setOperatingTime(operationTime);
        memberDetail.setPickupTime(pickupTime);
        memberDetail.setHoliday(holiday);
        memberDetail.setTempHoliday(tempHoliday);
        memberDetail.setBankName(bankName);
        memberDetail.setAccountName(accountName);
        memberDetail.setAccountNumber(accountNumber);
        return memberDetail;
    }
}
