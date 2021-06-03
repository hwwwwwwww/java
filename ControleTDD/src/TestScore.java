import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestScore {
	private Score s;
	@Before
	public void setUp() throws Exception {
		this.s = new Score(0);
	}

	@After
	public void tearDown() throws Exception {
		this.s=null;
	}

	@Test
	public void testOne() {
		this.s.one();
		assertEquals(1,this.s.getScore());
	}
	@Test
	public void testTwo() {
		this.s.two();
		assertEquals(2,this.s.getScore());
	}
	@Test
	public void testThree() {
		this.s.three();
		assertEquals(3,this.s.getScore());
	}
	

}
