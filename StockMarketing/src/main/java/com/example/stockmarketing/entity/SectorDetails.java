package com.example.stockmarketing.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SectorDetails {
    @Id
    @Column(length = 20)
    private String sector;

//    @ManyToOne
    @Column(length = 300)
    private String brief;
}
