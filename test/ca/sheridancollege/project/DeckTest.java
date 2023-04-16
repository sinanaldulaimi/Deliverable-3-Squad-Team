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
public class DeckTest {
    
    public DeckTest() {
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
     * Test of shuffle method, of class Deck.
     */
    @Test
public void testShuffle() {
System.out.println("shuffle");
Deck instance = new Deck();
instance.shuffle();
assertNotEquals("The shuffle method did not change the order of cards in the deck", new Deck(), instance);
}

    /**
     * Test of drawCard method, of class Deck.
     */
    @Test
public void testDrawCard() {
System.out.println("drawCard");
Deck instance = new Deck();
Card expResult = instance.drawCard();
assertNotNull("No card was drawn from the deck", expResult);
}

    /**
     * Test of isEmpty method, of class Deck.
     */
   @Test
public void testIsEmpty() {
    System.out.println("isEmpty");
    Deck instance = new Deck();
    boolean expResult = false;
    boolean result = instance.isEmpty();
    assertEquals("The deck is not empty upon creation", expResult, result);

    for (int i = 0; i < 52; i++) {
        instance.drawCard();
    }

    assertTrue("The deck should be empty after drawing all cards", instance.isEmpty());
}
}
