/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

public abstract class Game {
    protected final ArrayList<Player> players;
    protected final Deck deck;

    public Game() {
        players = new ArrayList<>();
        deck = createDeck();
    }

    protected abstract Deck createDeck();

    // Add a player to the game
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Remove a player from the game
    public void removePlayer(Player player) {
        players.remove(player);
    }

    // Get the number of players in the game
    public int getPlayerCount() {
        return players.size();
    }

    // Get a player by their index in the ArrayList
    public Player getPlayer(int index) {
        return players.get(index);
    }

    // Get a player by their name
    public Player getPlayerByName(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }
}
