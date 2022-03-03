package com.wine.partner.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="authority")
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String role;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
