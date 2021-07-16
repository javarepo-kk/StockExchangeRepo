package com.example.stockmarketing.entity;

import javax.persistence.*;

@Entity
public class StockCode {

    @ManyToOne
    @JoinColumn(name="companyName")
    private CompanyDetails companyDetails;

//    @Column(length = 120)
//    private String stockExchangeName;
    @ManyToOne
    @JoinColumn(name="stockExchangeName")
    private  StockExchangeDetails stockExchangeDetails;

    @OneToOne(mappedBy = "stockCode")
    private IPODetails ipoDetails;


    @Id
    @Column(length = 20)
    private String companyStockExchangeId;

    public CompanyDetails getCompanyDetails() {
        return companyDetails;
    }

    public void setCompanyDetails(CompanyDetails companyDetails) {
        this.companyDetails = companyDetails;
    }

    public StockExchangeDetails getStockExchangeDetails() {
        return stockExchangeDetails;
    }

    public void setStockExchangeDetails(StockExchangeDetails stockExchangeDetails) {
        this.stockExchangeDetails = stockExchangeDetails;
    }

    public String getCompanyStockExchangeId() {
        return companyStockExchangeId;
    }

    public void setCompanyStockExchangeId(String companyStockExchangeId) {
        this.companyStockExchangeId = companyStockExchangeId;
    }
//    @OneToOne
//    private IPODetails ipoDetails;
}
