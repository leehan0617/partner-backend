package com.wine.partner.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

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

    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
    private List<Authority> authorities = new ArrayList<>();

    public void addAuthority(Authority authority) {
        this.authorities.add(authority);
        authority.setMember(this);
    }
}
