import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMonome {
	
	private Monome m;
	
	@Before
	public void setUp() throws Exception {
		this.m = new Monome(2.0F,3);
		
	}
	@After
	public void tearDown() throws Exception {
		this.m = null;
	}

	@Test
	public void testConstructeurCoefficient() {
		assertEquals(2.0F,0,this.m.getCoefficient());
	}
	@Test
	public void testConstructeurExposant() {
		assertEquals(3,this.m.getExposant());
	}
	@Test
	public void testSomme() {
		Monome m1 = new Monome(5.0F,3);
		m.somme(m1);
		assertEquals(7.0F,0,this.m.getCoefficient());
		assertEquals(3,this.m.getExposant());
	}
	@Test
	public void testProduit() {
		Monome m1 = new Monome(5.0F,2);
		m.produit(m1);
		assertEquals(10.0F,0,this.m.getCoefficient());
		assertEquals(5,this.m.getExposant());
	}
	@Test
	public void testDérivée() {
		Monome m1 = new Monome(0.0F,0);
		m.dérivée();
		assertEquals(6.0F,0,this.m.getCoefficient());
		assertEquals(2,this.m.getExposant());
		m1.dérivée();
		assertEquals(0.0F,0,m1.getCoefficient());
		assertEquals(0,m1.getExposant());	
	}
	@Test
	public void testEstNul() {
		Monome m1 = new Monome(0.0F,0);
		assertFalse(this.m.estNul());
		assertTrue(m1.estNul());
	}
	@Test (expected = IllegalArgumentException.class)
	public void testExposantNegatif() {
		m = new Monome(2.0F,-2);
	}
	@Test (expected = ArithmeticException.class)
	public void testExposantNonEgaux() {
		Monome m1 = new Monome(0.0F,0);
		m.somme(m1);
	}
}
