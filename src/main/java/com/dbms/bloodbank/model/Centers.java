package com.dbms.bloodbank.model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Centers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
}
