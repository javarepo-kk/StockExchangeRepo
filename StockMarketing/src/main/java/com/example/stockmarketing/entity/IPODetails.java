package com.example.stockmarketing.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class IPODetails {

    @Id
    @Column(length = 20)
    private String companyStockExchangeId;



    @OneToOne(cascade = CascadeType.ALL,targetEntity = StockCode.class)
    @JoinColumn(name ="companyStockExchangeId",referencedColumnName = "companyStockExchangeId")
    private StockCode stockCode;

    private double pricePerShare;
    private int totalShares;


    @Column(length = 20)
    private String remarks;

    public String getCompanyStockExchangeId() {
        return companyStockExchangeId;
    }

    public void setCompanyStockExchangeId(String companyStockExchangeId) {
        this.companyStockExchangeId = companyStockExchangeId;
    }

    public StockCode getStockCode() {
        return stockCode;
    }

    public void setStockCode(StockCode stockCode) {
        this.stockCode = stockCode;
    }

    public double getPricePerShare() {
        return pricePerShare;
    }

    public void setPricePerShare(double pricePerShare) {
        this.pricePerShare = pricePerShare;
    }

    public int getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
