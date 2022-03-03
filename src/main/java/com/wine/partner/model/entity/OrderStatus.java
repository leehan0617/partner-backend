package com.wine.partner.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="order_status")
public class OrderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "status_code")
    private String statusCode;
    @Column(name = "agent_name")
    private String agentName;
    @Column(name = "agent_birth")
    private String agentBirth;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
