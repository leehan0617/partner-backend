package com.wine.partner.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "tb_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "order_type")
    private String orderType;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "customer_birth")
    private String customerBirth;
    @Column(name = "customer_phone")
    private String customerPhone;
    @Column(name = "wine_name")
    private String wineName;
    @Column(name = "per_price")
    private int perPrice;
    @Column(name = "supply_price")
    private int supplyPrice;
    private int amount;
    @Column(name = "reg_dt_str")
    private String regDtStr;
    @Column(name = "reg_dt")
    @Temporal(TemporalType.DATE)
    private Date regDt;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
    @ManyToOne
    @JoinColumn(name = "settlement_id")
    private Settlement settlement;
    @OneToMany(mappedBy = "order")
    private List<OrderStatus> orderStatusList;
}
