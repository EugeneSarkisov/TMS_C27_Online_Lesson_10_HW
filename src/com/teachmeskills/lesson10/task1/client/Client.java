package com.teachmeskills.lesson10.task1;

public class Client {
    private String name;
    private String surname;
    private Card[] cards;

    public Client(String name, String surname, Card[] cards) {
        this.name = name;
        this.surname = surname;
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }
}
