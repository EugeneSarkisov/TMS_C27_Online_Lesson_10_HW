package com.teachmeskills.lesson10.task1;

import java.util.Objects;

public class Card {
    private long cardNum;
    private int cvv;
    private double currentAmount;

    public Card(long cardNum, int cvv, double currentAmount) {
        this.cardNum = cardNum;
        this.cvv = cvv;
        this.currentAmount = currentAmount;
    }

    public long getCardNum() {
        return cardNum;
    }

    public void setCardNum(long cardNum) {
        this.cardNum = cardNum;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return getCardNum() == card.getCardNum() && getCvv() == card.getCvv();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCardNum(), getCvv());
    }
}
