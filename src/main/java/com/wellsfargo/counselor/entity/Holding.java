package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Holding {

    @Id
    @GeneratedValue()
    private long holdingId;

    @ManyToOne
    private Portfolio portfolio;

    @ManyToOne
    private Security security;

    @Column(nullable = false)
    private double quantity;

    protected Holding() {}

    public Holding(Portfolio portfolio, Security security, double quantity) {
        this.portfolio = portfolio;
        this.security = security;
        this.quantity = quantity;
    }

    public long getHoldingId() {
        return holdingId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}