package com.pavao.minhaeiro.models;

import java.math.BigDecimal;

public class DebitCard {
    private String bankName;
    private BigDecimal balance;
    Account account;

    public DebitCard(Account account, String bankName, BigDecimal balance) {
        this.account = account;
        this.bankName = bankName;
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Account getAccount() {
        return account;
    }

    public void addToBalance(BigDecimal balance) {
        this.balance = this.balance.add(balance);
        System.out.println("Valor de "+ balance + " foi adicionado com sucesso");
    }

    public void subtractToBalance(BigDecimal balance) {
        this.balance = this.balance.subtract(balance);
        System.out.println("Valor de "+ balance + " foi sacado com sucesso");
    }

}
