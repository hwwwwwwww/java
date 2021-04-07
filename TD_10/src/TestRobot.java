import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestRobot {
	private Robot1G r;
	@Before
	public void setUp() throws Exception {
		this.r = new Robot1G("r1");
	}

	@After
	public void tearDown() throws Exception {
		this.r = null;
	}

	@Test
	public void testAvancerNord() {
		this.r.avancer();
		assertEquals(new Position(-1,0),this.r.getPosition());
	}
	@Test
	public void testAvancerEst() {
		this.r.pivoterDroite();
		this.r.avancer();
		assertEquals(new Position(0,1),this.r.getPosition());
	}
	@Test
	public void testAvancerSud() {
		this.r.pivoterDroite();
		this.r.pivoterDroite();
		this.r.avancer();
		assertEquals(new Position(1,0),this.r.getPosition());
	}
	@Test
	public void testAvancerOuest() {
		this.r.pivoterGauche();
		this.r.avancer();
		assertEquals(new Position(0,-1),this.r.getPosition());
	}

}
