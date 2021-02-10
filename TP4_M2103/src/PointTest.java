import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PointTest {
	
	private Point p;
	
	@Before
	public void setUp() throws Exception {
	this.p = new Point(5.0F,2.0F);
	}

	@After
	public void tearDown() throws Exception {
		this.p=null;
	}

	@Test
	public void testConstructeurAbscisse() {
		assertEquals(5.0F,0,this.p.getAbscisse());
	}
	@Test
	public void testConstructeurOrdonnee() {
		assertEquals(2.0F,0,this.p.getOrdonnée());
	}
	@Test
	public void testTranslater() {
		float tx = 1.0F;
		float ty = 2.0F;
		this.p.translater(tx, ty);
		assertEquals(6.0F,0,this.p.getAbscisse());
		assertEquals(4.0F,0,this.p.getOrdonnée());
	}
	@Test
	public void testMettreAEchelle() {
		float h = 2.0F;
		this.p.mettreAEchelle(h);
		assertEquals(10.0F,0,this.p.getAbscisse());
		assertEquals(4.0F,0,this.p.getOrdonnée());
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMettreAEchelleNegatif() {
		float h=-1.0F;
		this.p.mettreAEchelle(h);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMettreAEchelleNegatif2() {
		float h = -20.0F;
		this.p.mettreAEchelle(h);
	}
  

}
