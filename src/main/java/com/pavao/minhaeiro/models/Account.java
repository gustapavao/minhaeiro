package com.pavao.minhaeiro.models;

import jakarta.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String accountHolder;
    private String bankName;
    private double balance;

    public Account() {}

    public void deposit(double valor) {
        balance += valor;
    }

    public boolean withdraw(double valor) {
        if (valor <= balance) {
            balance -= valor;
            return true;
        } else {
            return false;
        }
    }

    public double checkBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
