package com.teachmeskills.lesson10.task1;

public class CardChecker {
    public static void checkSameCards(Card[] cards) {
        if (cards.length == 0) {
            System.out.println("Client doesn't have any cards");
            return;
        }

        int sameCardsCount = 0;
        int sameCards = 0;
        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                if (cards[i].equals(cards[j])) {
                    sameCardsCount++;
                    Card cardSwap = null;
                    int tempVar = i + sameCardsCount;
                    cardSwap = cards[j];
                    cards[j] = cards[tempVar];
                    cards[tempVar] = cardSwap;
                }
            }
            i += sameCardsCount;
            sameCards += sameCardsCount;
            if (sameCardsCount != 0) {
                System.out.println("Client have " + (sameCardsCount + 1) + " same " +
                                   cards[i - sameCardsCount].getCardNum() + " cards");
                sameCardsCount = 0;
            }
        }

        if (sameCards == 0) {
            System.out.println("Client doesn't have same cards");
        } else {
            System.out.println("Client have " + (sameCards * 2) + " same cards");
        }
    }
}


