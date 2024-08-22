package com.pavao.minhaeiro.models;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class CreditCard {

    private String cardNumber;
    private String cardHolderName;
    private YearMonth expiryDate;
    private String bank;
    private CardType cardType;

    public CreditCard(String cardNumber, String cardHolderName, YearMonth expiryDate, String bank, CardType cardType) {
        if (expiryDate.isBefore(YearMonth.now())) {
            throw new IllegalArgumentException("Data de validade expirada");
        }
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cardType = cardType;
        this.bank = bank;
        }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getMaskedCardNumber() {
        return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public YearMonth getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(YearMonth expiryDate) {
        if (expiryDate.isBefore(YearMonth.now())) {
            throw new IllegalArgumentException("Data de validade expirada");
        }
        this.expiryDate = expiryDate;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }


    // Implementação do algoritmo de Luhn para validação do número do cartão
    private boolean luhnCheck(String cardNumber) {
        int sum = 0;
        boolean alternate = false;
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(cardNumber.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + getMaskedCardNumber() + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", expiryDate=" + expiryDate.format(DateTimeFormatter.ofPattern("MM/yy")) +
                ", cardType=" + cardType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditCard that = (CreditCard) o;

        return Objects.equals(cardNumber, that.cardNumber);
    }

    @Override
    public int hashCode() {
        return cardNumber != null ? cardNumber.hashCode() : 0;
    }

    public enum CardType {
        VISA,
        MASTERCARD,
        AMERICAN_EXPRESS,
        DISCOVER,
        ELO,
        HIPERCARD,
        OTHER
    }
}


