package ca.sheridancollege.project;

import java.util.ArrayList;
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
public class HandTest {
    
    private Hand hand;
    
    public HandTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        hand = new Hand();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCards method, of class Hand.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        ArrayList<Card> expResult = new ArrayList<>();
        ArrayList<Card> result = hand.getCards();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCards method, of class Hand.
     */
    @Test
    public void testSetCards() {
        System.out.println("setCards");
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card("Test Value", "Test Suit"));
        hand.setCards(cards);
        assertEquals(cards, hand.getCards());
    }

    /**
     * Test of addCard method, of class Hand.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card card = new Card("Test Value", "Test Suit");
        hand.addCard(card);
        assertTrue(hand.getCards().contains(card));
    }

    /**
     * Test of removeCard method, of class Hand.
     */
    @Test
    public void testRemoveCard() {
        System.out.println("removeCard");
        Card card = new Card("Test Value", "Test Suit");
        hand.addCard(card);
        hand.removeCard(card);
        assertFalse(hand.getCards().contains(card));
    }
}