/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sinan
 */
public class HumanPlayerTest {
    
    public HumanPlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of displayHand method, of class HumanPlayer.
     */
    @Test
public void testDisplayHand() {
    System.out.println("displayHand");
    String playerName = "John";
    HumanPlayer instance = new HumanPlayer(playerName);
    // Add cards to the player's hand if necessary
    // for example:
    // instance.getHand().addCard(new Card(Rank.ACE, Suit.HEARTS));
    // instance.getHand().addCard(new Card(Rank.TWO, Suit.CLUBS));

    // Now call the displayHand method
    instance.displayHand();
}
    
}
