package com.wine.partner.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name="tb_member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "user_id")
    private String userId;
    private String password;
    @Column(name = "reg_dt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date regDt;

    @OneToMany(mappedBy = "member")
    private Set<Authority> authorities;
    @OneToOne(mappedBy = "member")
    private SubscribeCertification subscribeCertification;
    @OneToOne(mappedBy = "member")
    private MemberDetail memberDetail;
    @OneToMany(mappedBy = "member")
    private List<Order> orderList;
}
