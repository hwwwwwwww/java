import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestScoreKeeper {

	private ScoreKeeper s;
	
	@Before
	public void setUp() throws Exception {
		this.s= new ScoreKeeper();
	}

	@After
	public void tearDown() throws Exception {
		this.s=null;
	}
	@Test
	public void testDebutDePartie() {
		assertEquals("000:000", this.s.getScore());
	}
	@Test
	public void testScoreA1() {
		this.s.scoreTeamA1();
		assertEquals("001:000",this.s.getScore());
		this.s.scoreTeamA1();
		assertEquals("002:000",this.s.getScore());
		this.s.scoreTeamA1();
		assertEquals("003:000",this.s.getScore());
		
	}
	@Test
	public void testScoreA2() {
		this.s.scoreTeamA2();
		assertEquals("002:000",this.s.getScore());
		this.s.scoreTeamA2();
		assertEquals("004:000",this.s.getScore());
		this.s.scoreTeamA2();
		assertEquals("006:000",this.s.getScore());
		
	}
	@Test
	public void testScoreA3() {
		this.s.scoreTeamA3();
		assertEquals("003:000",this.s.getScore());
		this.s.scoreTeamA3();
		assertEquals("006:000",this.s.getScore());
		this.s.scoreTeamA3();
		assertEquals("009:000",this.s.getScore());
		this.s.scoreTeamA3();
		assertEquals("012:000",this.s.getScore());
	}
	@Test
	public void testScoreB1() {
		this.s.scoreTeamB1();
		assertEquals("000:001",this.s.getScore());
		this.s.scoreTeamB1();
		assertEquals("000:002",this.s.getScore());
		this.s.scoreTeamB1();
		assertEquals("000:003",this.s.getScore());
		
	}
	@Test
	public void testScoreB2() {
		this.s.scoreTeamB2();
		assertEquals("000:002",this.s.getScore());
		this.s.scoreTeamB2();
		assertEquals("000:004",this.s.getScore());
		this.s.scoreTeamB2();
		assertEquals("000:006",this.s.getScore());
		
	}
	@Test
	public void testScoreB3() {
		this.s.scoreTeamB3();
		assertEquals("000:003",this.s.getScore());
		this.s.scoreTeamB3();
		assertEquals("000:006",this.s.getScore());
		this.s.scoreTeamB3();
		assertEquals("000:009",this.s.getScore());
		this.s.scoreTeamB3();
		assertEquals("000:012",this.s.getScore());
	}
	@Test
	public void testScore() {
		this.s.scoreTeamA2();
		assertEquals("002:000",this.s.getScore());
		this.s.scoreTeamB3();
		assertEquals("002:003",this.s.getScore());
		this.s.scoreTeamA2();
		assertEquals("004:003",this.s.getScore());
		this.s.scoreTeamB1();
		assertEquals("004:004",this.s.getScore());
		this.s.scoreTeamA3();
		assertEquals("007:004",this.s.getScore());
		this.s.scoreTeamB2();
		assertEquals("007:006",this.s.getScore());
		this.s.scoreTeamA2();
		assertEquals("009:006",this.s.getScore());
		this.s.scoreTeamB3();
		assertEquals("009:009",this.s.getScore());
		this.s.scoreTeamA1();
		assertEquals("010:009",this.s.getScore());
		this.s.scoreTeamB2();
		assertEquals("010:011",this.s.getScore());
	}
	

}
