package com.teachmeskills.lesson10.task1;

public class Runner {
    public static void main(String[] args) {
        Client client = new Client("Name", "Surname", CardFabric.createCards());
        CardChecker.checkSameCards(client.getCards());
    }
}
