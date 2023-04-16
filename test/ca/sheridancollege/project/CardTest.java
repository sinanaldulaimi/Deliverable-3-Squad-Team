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
public class CardTest {
    
    public CardTest() {
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
     * Test of getRank method, of class Card.
     */
    @Test
   public void testGetRank() {
        Card card = new Card("Ace", "Spades");
        assertEquals("Ace", card.getRank());
    }

    /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuit() {
        Card card = new Card("Ace", "Spades");
        assertEquals("Spades", card.getSuit());
    }


    /**
     * Test of toString method, of class Card.
     */
    @Test
     public void testToString() {
        Card card = new Card("Ace", "Spades");
        assertEquals("Ace of Spades", card.toString());
    }
    
}
