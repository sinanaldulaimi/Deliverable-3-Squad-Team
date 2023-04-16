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
public class GameTest {
    
    public GameTest() {
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
     * Test of createDeck method, of class Game.
     */
    @Test
    public void testCreateDeck() {
        System.out.println("createDeck");
        Game instance = new GameImpl();
        Deck result = instance.createDeck();
        assertNotNull(result);
    }

    /**
     * Test of addPlayer method, of class Game.
     */
    @Test
    public void testAddPlayer() {
        System.out.println("addPlayer");
        Player player = new Player("Alice");
        Game instance = new GameImpl();
        instance.addPlayer(player);
        assertEquals(1, instance.getPlayerCount());
    }


    /**
     * Test of removePlayer method, of class Game.
     */
    @Test
    public void testRemovePlayer() {
        System.out.println("removePlayer");
        Player player = new Player("Alice");
        Game instance = new GameImpl();
        instance.addPlayer(player);
        instance.removePlayer(player);
        assertEquals(0, instance.getPlayerCount());
    }

    /**
     * Test of getPlayerCount method, of class Game.
     */
    @Test
    public void testGetPlayerCount() {
        System.out.println("getPlayerCount");
        Game instance = new GameImpl();
        assertEquals(0, instance.getPlayerCount());
    }

    /**
     * Test of getPlayer method, of class Game.
     */
    @Test
    public void testGetPlayer() {
        System.out.println("getPlayer");
        Player player = new Player("Alice");
        Game instance = new GameImpl();
        instance.addPlayer(player);
        Player result = instance.getPlayer(0);
        assertEquals(player, result);
    }

    /**
     * Test of getPlayerByName method, of class Game.
     */
    @Test
    public void testGetPlayerByName() {
        System.out.println("getPlayerByName");
        String name = "Alice";
        Player player = new Player(name);
        Game instance = new GameImpl();
        instance.addPlayer(player);
        Player result = instance.getPlayerByName(name);
        assertEquals(player, result);
    }

    public class GameImpl extends Game {

    public Deck createDeck() {
        return new Deck();
    }
}

    
}
