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
public class GoFishGameTest {
    
    public GoFishGameTest() {
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
     * Test of createDeck method, of class GoFishGame.
     */
    @Test
    public void testCreateDeck() {
        System.out.println("createDeck");
        GoFishGame instance = new GoFishGame();
        Deck result = instance.createDeck();
        assertNotNull(result);
    }

    /**
     * Test of registerPlayer method, of class GoFishGame.
     */
    @Test
    public void testRegisterPlayer() {
        System.out.println("registerPlayer");
        Player player = new HumanPlayer("Player1");
        GoFishGame instance = new GoFishGame();
        instance.registerPlayer(player);

        Player registeredPlayer = instance.getPlayerByName("Player1");
        assertNotNull(registeredPlayer);
        assertEquals("Player1", registeredPlayer.getName());
    }

  
    @Test
    public void testGetPlayerByName() {
        System.out.println("getPlayerByName");
        String name = "Player1";
        GoFishGame instance = new GoFishGame();
        instance.registerPlayer(new HumanPlayer(name));
        Player result = instance.getPlayerByName(name);
        assertNotNull(result);
        assertEquals(name, result.getName());
    }
}

