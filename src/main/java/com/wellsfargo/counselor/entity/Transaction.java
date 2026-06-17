package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue()
    private long transactionId;

    @ManyToOne
    private Account account;

    @ManyToOne
    private Security security;

    @Column(nullable = false)
    private String transactionType;

    @Column(nullable = false)
    private double quantity;

    protected Transaction() {}

    public Transaction(Account account, Security security,
                       String transactionType, double quantity) {
        this.account = account;
        this.security = security;
        this.transactionType = transactionType;
        this.quantity = quantity;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}