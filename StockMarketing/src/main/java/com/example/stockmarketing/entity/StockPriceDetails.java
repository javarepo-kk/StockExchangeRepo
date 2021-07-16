package com.example.stockmarketing.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import java.sql.Timestamp;
@Entity
public class StockPriceDetails {

    @Id
    @Column(length = 20)
    private String companyStockExchangeId;

    private double currentPrice;

    private Timestamp currentDateTime;
}
