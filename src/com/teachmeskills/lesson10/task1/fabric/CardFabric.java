package com.teachmeskills.lesson10.task1;

public class CardFabric {
    public static Card[] createCards(){
        Card card1 = new Card(111_111_111, 111, 100.00);
        Card card2 = new Card(222_222_222, 222, 200.00);
        Card card3 = new Card(333_333_333, 333, 300.00);
        Card card4 = new Card(444_444_444, 444, 400.00);
        Card card5 = new Card(111_111_111, 111, 500.00);
        Card card6 = new Card(222_222_222, 222, 600.00);
        Card card7 = new Card(333_333_333, 333, 700.00);
        Card card8 = new Card(444_444_444, 444, 800.00);
        Card card9 = new Card(555_555_555, 555, 900.00);
        Card[] cards = new Card[9];
        cards[0] = card1;
        cards[1] = card2;
        cards[2] = card3;
        cards[3] = card4;
        cards[4] = card5;
        cards[5] = card6;
        cards[6] = card7;
        cards[7] = card8;
        cards[8] = card9;
        return cards;
    }
}
