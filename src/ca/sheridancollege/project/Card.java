package ca.sheridancollege.project;

public class Card {
    private final String rank;
    private final String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
