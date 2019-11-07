/**
 * ShuffleDeck.java
 * @author Nathan Branson 
 */


public class ShuffleDeck{
    public static void main(String[] args){

        String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades"};
        String[] RANKS = 
        {
            "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King", "Ace"
        };

        int Ranklen = RANKS.length;
        int Suitlen = SUITS.length;

        String[] deck = new String[Ranklen * Suitlen];
        for(int i = 0; i < Ranklen; i++){
            for (int j = 0; j < Suitlen; j++){
                deck[Suitlen * i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }

        int n = deck.length;
        for (int i = 0; i < n; i++){
            int r = i + (int)(Math.random() * (n-i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
            System.out.println(deck[i]);
        }
       
    }
}