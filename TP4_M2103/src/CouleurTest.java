import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CouleurTest {

	private Couleur c;
	
	@Before
	public void setUp() throws Exception {
		this.c = new Couleur(1,2,3);
	}

	@After
	public void tearDown() throws Exception {
		this.c = null;
	}
	

	@Test
	public void testConstructeurRouge() {
		assertEquals(1, this.c.getRouge());
	}
	@Test
	public void testConstructeurVert() {
		assertEquals(2, this.c.getVert());
	}
	@Test
	public void testConstructeurBleu() {
		assertEquals(3, this.c.getBleu());
	}
	@Test
	public void testSetterRouge() {
		this.c.setRouge(255);
		assertEquals(255, this.c.getRouge());
	}
	@Test
	public void testSetterVert() {
		this.c.setVert(255);
		assertEquals(255, this.c.getVert());
	}
	@Test
	public void testSetterBleu() {
		this.c.setBleu(255);
		assertEquals(255, this.c.getBleu());
	}
	@Test
	public void testConstanteRouge() {
		assertEquals(255,Couleur.ROUGE.getRouge());
		assertEquals(0,Couleur.ROUGE.getVert());
		assertEquals(0,Couleur.ROUGE.getBleu());
	}
	@Test
	public void testConstanteVert() {
		assertEquals(0,Couleur.VERT.getRouge());
		assertEquals(255,Couleur.VERT.getVert());
		assertEquals(0,Couleur.VERT.getBleu());
	}
	@Test
	public void testConstanteBleu() {
		assertEquals(0,Couleur.BLEU.getRouge());
		assertEquals(0,Couleur.BLEU.getVert());
		assertEquals(255,Couleur.BLEU.getBleu());
	}
	@Test (expected = IllegalArgumentException.class)
   public void testNegativeRouge() {
		this.c.setRouge(-1);
	}
	@Test (expected = IllegalArgumentException.class)
	   public void testNegativeVert() {
			this.c.setVert(-1);
		}
	@Test (expected = IllegalArgumentException.class)
	   public void testNegativeBleu() {
			this.c.setBleu(-1);
		}
	@Test (expected = IllegalArgumentException.class)
	   public void testTropGrandeRouge() {
			this.c.setRouge(300);
		}
	@Test (expected = IllegalArgumentException.class)
	   public void testTropGrandeVert() {
			this.c.setVert(300);
		}
	@Test (expected = IllegalArgumentException.class)
	   public void testTropGrandeBleu() {
			this.c.setBleu(300);
		}
	@Test
	public void testValeurRVB() {
		assertEquals(256*256 +2 *256+3,this.c.valeurRVB());
	}
}
