import static junit.framework.TestSuite.warning;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class EpicLANProjectTEST {
	@Before
	public void setUp() {
		RankingTable rT = new RankingTable();
		Player p1 = new Player("Hanton", rT.generateUserID());
		Player p2 = new Player("Quiq", rT.generateUserID());
		Player p3 = new Player("Erik!!", rT.generateUserID());
		Player p4 = new Player("ctrlshift", rT.generateUserID());
		rT.add(p1);
		rT.add(p2);
		rT.add(p3);
		rT.add(p4);
	}
	@After
	public void tearDown() {
		
	}
	@Test
	public void test() {
        warning("Not yet implemented");
	}

}
