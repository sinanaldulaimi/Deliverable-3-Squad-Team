package ca.sheridancollege.project;



// Import the Hand class

public class Player {

    private String name;
    private int score;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.hand = new Hand();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void addCard(Card card) {
        hand.addCard(card);
    }

    public void removeCard(Card card) {
        hand.getCards().remove(card);
    }

    public void addPoint() {
        this.score++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", hand=" + hand.getCards() +
                '}';
    }
}
