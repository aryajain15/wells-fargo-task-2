package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String ticker;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double currentPrice;

    protected Security() {}

    public Security(String ticker, String name, double currentPrice) {
        this.ticker = ticker;
        this.name = name;
        this.currentPrice = currentPrice;
    }

    public long getSecurityId() {
        return securityId;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}