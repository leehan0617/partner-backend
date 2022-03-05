package com.wine.partner.model.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wine.partner.model.entity.Member;
import com.wine.partner.model.entity.MemberDetail;
import lombok.Getter;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

// TODO. add valid config
@Getter
public class MemberRequest {
    @JsonProperty("user_id")
    private String userId;
    private String password;
    private String name;
    private String region;
    @JsonProperty("phone_number")
    private String phoneNumber;
    private String address;
    @JsonProperty("detail_address")
    private String detailAddress;
    @JsonProperty("zip_code")
    private String zipCode;
    @JsonProperty("operating_time")
    private String operating_time;
    private String holiday;
    @JsonProperty("temp_holiday")
    private String tempHoliday;
    @JsonProperty("pickup_time")
    private String pickupTime;
    @JsonProperty("bank_name")
    private String bankName;
    @JsonProperty("account_name")
    private String accountName;
    @JsonProperty("account_number")
    private String accountNumber;

    @JsonIgnore
    public Member getMember(PasswordEncoder encoder) {
        Member member = new Member();
        member.setUserId(userId);
        member.setPassword(encoder.encode(password));
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
        memberDetail.setOperatingTime(operating_time);
        memberDetail.setPickupTime(pickupTime);
        memberDetail.setHoliday(holiday);
        memberDetail.setTempHoliday(tempHoliday);
        memberDetail.setBankName(bankName);
        memberDetail.setAccountName(accountName);
        memberDetail.setAccountNumber(accountNumber);
        return memberDetail;
    }
}
