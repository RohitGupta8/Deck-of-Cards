package com.bl.deckofcard;

import java.util.ArrayList;

public class DeckOfCards {
    ArrayList<String> cardsDeck = new ArrayList<>();

    /**
     * method for Initialize the game of Deck of cards
     */
    public void deckOfCards() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace"};
        int numbersOfCards = suits.length * ranks.length;
        System.out.println("Number of Cards In Deck -> " + numbersOfCards);
        for (String rank : ranks) {
            for (String suit : suits) {
                cardsDeck.add(rank + " of " + suit);
            }
        }
    }
}
