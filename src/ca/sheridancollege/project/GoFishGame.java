/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;


import java.util.Scanner;





public class GoFishGame extends Game {
    private final PlayerGroup playerGroup;

    public GoFishGame() {
        super();
        playerGroup = new PlayerGroup();
    }

    @Override
    protected Deck createDeck() {
        return new Deck();
    }

    public void registerPlayer(Player player) {
        playerGroup.addPlayer(player);
    }

    public void startGame() {
        Scanner input = new Scanner(System.in);
        deck.shuffle();
        dealCards();

        while (true) {
            for (int i = 0; i < playerGroup.getPlayerCount(); i++) {
                Player currentPlayer = playerGroup.getPlayer(i);

                System.out.println(currentPlayer.getName() + ", it's your turn.");
                System.out.println("Your current score is: " + currentPlayer.getScore());
                if (currentPlayer instanceof HumanPlayer) {
    ((HumanPlayer) currentPlayer).displayHand();
}
                System.out.print("Enter the name of the player you want to ask: ");

                String opponentName = input.nextLine();
                Player opponent = getPlayerByName(opponentName);

                if (opponent == null) {
                    System.out.println("Invalid player name. Please try again.");
                    continue;
                }

                System.out.print("Enter the rank you want to ask for: ");
                String rank = input.nextLine();

                System.out.println("Do you have any " + rank + "'s?");
                System.out.print("Enter 'yes' or 'no': ");

                String answer = input.nextLine();
                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("Congratulations! You got a match.");
                    currentPlayer.addPoint();
                } else {
                    System.out.println("Go Fish!");
                    Card drawnCard = deck.drawCard();
                    System.out.println("You drew a " + drawnCard.toString());

                    if (drawnCard.getRank().equals(rank)) {
                        System.out.println("Congratulations! You got a match.");
                        currentPlayer.addPoint();
                    } else {
                        System.out.println("Sorry, no match. Turn over.");
                    }
                }

                if (deck.isEmpty()) {
                    System.out.println("The deck is empty.");
                    break;
                }
            }

            Player winner = getWinner();
            if (winner != null) {
                System.out.println("The game is over! The winner is " + winner.getName() + " with a score of " + winner.getScore());
                break;
            }
        }
    }

    private void dealCards() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < playerGroup.getPlayerCount(); j++) {
                playerGroup.getPlayer(j).addCard(deck.drawCard());
            }
        }
    }

    @Override
    public Player getPlayerByName(String name) {
        return playerGroup.getPlayerByName(name);
    }

    private Player getWinner() {
        int maxScore = 0;
        Player winner = null;
        for (int i = 0; i < playerGroup.getPlayerCount(); i++) {
            Player player = playerGroup.getPlayer(i);
            if (player.getScore() > maxScore) {
                maxScore = player.getScore();
                winner = player;
            }
        }

        if (maxScore >= 5) {
            return winner;
        } else {
            return null;
        }
    }
}
