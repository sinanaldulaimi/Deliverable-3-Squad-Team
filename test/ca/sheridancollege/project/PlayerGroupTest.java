package ca.sheridancollege.project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerGroupTest {
    
    private PlayerGroup playerGroup;
    
    @Before
    public void setUp() {
        playerGroup = new PlayerGroup();
    }
    
    @After
    public void tearDown() {
        playerGroup = null;
    }

    @Test
    public void testAddPlayer() {
        System.out.println("addPlayer");
        Player player = new Player("John");
        playerGroup.addPlayer(player);
        assertEquals(1, playerGroup.getPlayerCount());
        assertEquals(player, playerGroup.getPlayer(0));
    }

    @Test
    public void testGetPlayerByName() {
        System.out.println("getPlayerByName");
        String name = "John";
        Player player = new Player(name);
        playerGroup.addPlayer(player);
        Player result = playerGroup.getPlayerByName(name);
        assertNotNull(result);
        assertEquals(name, result.getName());
    }

    @Test
    public void testGetPlayerCount() {
        System.out.println("getPlayerCount");
        assertEquals(0, playerGroup.getPlayerCount());
        playerGroup.addPlayer(new Player("John"));
        playerGroup.addPlayer(new Player("Jane"));
        assertEquals(2, playerGroup.getPlayerCount());
    }

    @Test
    public void testGetPlayer() {
        System.out.println("getPlayer");
        Player player1 = new Player("John");
        Player player2 = new Player("Jane");
        playerGroup.addPlayer(player1);
        playerGroup.addPlayer(player2);
        assertEquals(player1, playerGroup.getPlayer(0));
        assertEquals(player2, playerGroup.getPlayer(1));
    }
}
