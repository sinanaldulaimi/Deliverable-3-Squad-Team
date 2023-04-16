/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ca.sheridancollege.project;
import java.util.Scanner;

/**
 *
 * @author Ammmar Alnqeeb,Ali Alsudani,Sinan Aldulaimi,Iman Alghanimi,  March 2023
 */
public class Main {

    public static void main(String[] args) {
        GoFishGame game = new GoFishGame();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter player 1's name: ");
        HumanPlayer player1 = new HumanPlayer(input.nextLine());

        System.out.print("Enter player 2's name: ");
        HumanPlayer player2 = new HumanPlayer(input.nextLine());

        System.out.print("Enter player 3's name: ");
        HumanPlayer player3 = new HumanPlayer(input.nextLine());

        System.out.print("Enter player 4's name: ");
        HumanPlayer player4 = new HumanPlayer(input.nextLine());

        game.registerPlayer(player1);
        game.registerPlayer(player2);
        game.registerPlayer(player3);
        game.registerPlayer(player4);

        game.startGame();
    }
}
