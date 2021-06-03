import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestScoreKeeper {
	private ScoreKeeper scoreKeeper;
	@Before
	public void setUp() throws Exception {
		this.scoreKeeper = new ScoreKeeper();
	}

	@After
	public void tearDown() throws Exception {
		this.scoreKeeper = null;
	}

	@Test
	public void testInitialisationScoreKeeper() {
		assertEquals(0,this.scoreKeeper.getScoreTeamA());
		assertEquals(0,this.scoreKeeper.getScoreTeamB());
	}
	
	@Test
	public void testScoreTeamAButton() {
		this.scoreKeeper.scoreTeamA1();
		assertEquals(1,this.scoreKeeper.getScoreTeamA());
	}
	@Test
	public void testScoreTeamBButton() {
		this.scoreKeeper.scoreTeamB1();
		assertEquals(1,this.scoreKeeper.getScoreTeamB());
	}
	@Test
	public void testScoreTeamA2Button() {
		this.scoreKeeper.scoreTeamA2();
		assertEquals(2,this.scoreKeeper.getScoreTeamA());
	}
	@Test
	public void testScoreTeamB2Button() {
		this.scoreKeeper.scoreTeamB2();
		assertEquals(2,this.scoreKeeper.getScoreTeamB());
	}
	@Test
	public void testScoreTeamA3Button() {
		this.scoreKeeper.scoreTeamA3();
		assertEquals(3,this.scoreKeeper.getScoreTeamA());
	}
	@Test
	public void testScoreTeamB3Button() {
		this.scoreKeeper.scoreTeamB3();
		assertEquals(3,this.scoreKeeper.getScoreTeamB());
	}
	@Test
	public void testFormattingOfTheScores() {
		assertEquals("000:000",this.scoreKeeper.getScore());
	}
	@Test
	public void testAcceptation() {
		this.scoreKeeper.scoreTeamA3();
		this.scoreKeeper.scoreTeamA3();
		this.scoreKeeper.scoreTeamA3();
		this.scoreKeeper.scoreTeamA3();
		this.scoreKeeper.scoreTeamA3();
		this.scoreKeeper.scoreTeamA1();
		this.scoreKeeper.scoreTeamB2();
		this.scoreKeeper.scoreTeamB2();
		this.scoreKeeper.scoreTeamB2();
		this.scoreKeeper.scoreTeamB2();
		this.scoreKeeper.scoreTeamB2();
		assertEquals("016:010",this.scoreKeeper.getScore());
	}

}
