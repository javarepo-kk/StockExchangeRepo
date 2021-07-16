package com.example.stockmarketing.entity;

import javax.persistence.*;

@Entity
public class CompanyDetails {

    @Id
    @Column(length = 40)
    private String companyName;

    @Column(length = 10)
    private String companyCode;


    private double turnover;

    @Column(length = 40)
    private String CEO;

    @Column(length = 400)
    private String BOD;


    @ManyToOne
    @JoinColumn(name="sector")
    private SectorDetails sectorDetials;


    @Column(length = 600)
    private String description;



}
