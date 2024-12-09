package com.dbms.bloodbank.model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Inventory {
    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long centerId;

    @Column(nullable = false)
    private String bloodType;

    @Column(nullable = false)
    private Integer quantity;

    public void setId(Long id) {
        this.id = id;
    }

    public void setCenterId(Long centerId) {
        this.centerId = centerId;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

