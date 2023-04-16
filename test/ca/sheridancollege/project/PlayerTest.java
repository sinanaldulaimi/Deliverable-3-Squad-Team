package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    
    private Player player;

    public PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        player = new Player("John Doe");
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "John Doe";
        String result = player.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Jane Doe";
        player.setName(name);
        assertEquals(name, player.getName());
    }

    @Test
    public void testGetScore() {
        System.out.println("getScore");
        int expResult = 0;
        int result = player.getScore();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetScore() {
        System.out.println("setScore");
        int score = 5;
        player.setScore(score);
        assertEquals(score, player.getScore());
    }

  @Test
public void testGetHand() {
    System.out.println("getHand");
    Hand result = player.getHand();
    assertNotNull(result);
    assertEquals(0, result.getCards().size());
}

    @Test
    public void testSetHand() {
        System.out.println("setHand");
        Hand hand = new Hand();
        Card card = new Card("Test Value", "Test Suit");
        hand.addCard(card);
        player.setHand(hand);
        assertEquals(hand, player.getHand());
    }

    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card card = new Card("Test Value", "Test Suit");
        player.addCard(card);
        assertTrue(player.getHand().getCards().contains(card));
    }

    @Test
    public void testRemoveCard() {
        System.out.println("removeCard");
        Card card = new Card("Test Value", "Test Suit");
        player.addCard(card);
        player.removeCard(card);
        assertFalse(player.getHand().getCards().contains(card));
    }

    @Test
    public void testAddPoint() {
        System.out.println("addPoint");
        player.addPoint();
        assertEquals(1, player.getScore());
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Player{name='John Doe', score=0, hand=" + player.getHand().getCards() + "}";
        String result = player.toString();
        assertEquals(expResult, result);
    }
}
