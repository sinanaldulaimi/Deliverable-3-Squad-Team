package ca.sheridancollege.project;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
    }

 public void displayHand() {
    StringBuilder handDisplay = new StringBuilder("Your hand: ");
    for (Card card : getHand().getCards()) {
        handDisplay.append(card.toString()).append(", ");
    }
    handDisplay.setLength(handDisplay.length() - 2);
    System.out.println(handDisplay);
}
}
