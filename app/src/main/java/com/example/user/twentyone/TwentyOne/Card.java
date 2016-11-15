package com.example.user.twentyone.TwentyOne;

/**
 * Created by user on 14/11/2016.
 */

public class Card {

    private Suit suit;
    private Rank rank;

    public Card(int s, int r){
        suit = Suit.values()[s];
        rank = Rank.values()[r];
    }

//    class example
//    public int getValue() {
//        int value = rank.ordinal() + 1;
//        if (value > 10) value = 10;
//        return value;
//    }

    public int getCardValue(){
        if(suit.ordinal() < 9)
        return suit.ordinal();
        else
            return 10;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

}
