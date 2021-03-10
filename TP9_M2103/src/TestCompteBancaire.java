import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCompteBancaire {
	private CompteBancaire c;
	@Before
	public void setUp() throws Exception {
		this.c = new CompteBancaire("test");
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testEqualsType() {
		String fail= "test";
		assertFalse(c.equals(fail));
	}
	@Test
	public void testEqualsClass() {
		CompteEpargne c1 = new CompteEpargne("test",2.0F);
		assertFalse(c.equals(c1));
	}
	@Test
	public void testEqualsNull() {
		String fail2 = null;
		assertFalse(c.equals(fail2));
	}
	@Test
	public void testEqualsDifferents() {
		CompteBancaire c2 = new CompteBancaire("testt");
		assertFalse(c.equals(c2));
	}
	@Test
	public void testEquals() {
		CompteBancaire c3 = new CompteBancaire("test");
		assertTrue(c.equals(c3));
	}

}
