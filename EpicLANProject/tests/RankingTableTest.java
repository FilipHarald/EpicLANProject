import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LANHelper.Player;
import LANHelper.RankingTable;

public class RankingTableTest extends TestCase {
    RankingTable rt;

    @Before
    public void setUp() {
        rt = new RankingTable();
    }

    @After
    public void tearDown() {
        rt = null;
    }

    @Test
    public void testRanking() {
        Player me = new Player("Erik Bjäreholt", 1337);
        me.setRating(1600);
        rt.add(me);
        rt.add(new Player("Frodo Baggins", 314569));
        assertEquals(rt.getPlayerList().get(0), me);
    }

    @Test
    public void testUserID() {
        rt.add(new Player("Erik Bjäreholt", 1));
        rt.add(new Player("Frodo Baggins", 2));
        assertEquals(rt.generateUserID(), 3);
        rt.add(new Player("Kirby", rt.generateUserID()));
        assertEquals(rt.generateUserID(), 4);
    }
}