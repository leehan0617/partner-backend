package com.wine.partner.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table
public class SubscribeCertification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "customer_info")
    private String customerInfo;
    @Column(name = "reg_dt")
    @Temporal(TemporalType.DATE)
    private Date regDt;
    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
