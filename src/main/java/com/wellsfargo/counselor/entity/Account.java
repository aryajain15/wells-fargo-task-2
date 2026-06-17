package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Account {

    @Id
    @GeneratedValue()
    private long accountId;

    @Column(nullable = false)
    private String accountNumber;

    @Column(nullable = false)
    private double balance;

    @ManyToOne
    private Portfolio portfolio;

    protected Account() {}

    public Account(String accountNumber, double balance, Portfolio portfolio) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.portfolio = portfolio;
    }

    public long getAccountId() {
        return accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}