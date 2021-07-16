package com.example.stockmarketing.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StockExchangeDetails {

    @Column(length = 10)
    private String stockExchangeId;

    @Id
    @Column(length = 120)
    private String stockExchangeName;

    @Column(length = 200)
    private String brief;

    @Column(length = 200)
    private String address;

    @Column(length = 200)
    private String remarks;
}
