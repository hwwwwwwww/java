import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestLettre {
	private Lettre l;
	@Before
	public void setUp() throws Exception {
		this.l = new Lettre("Nimes","31400","123 rue test",10,3.5F,0);
	}

	@After
	public void tearDown() throws Exception {
		this.l = null;
	}

	@Test
	public void testAffranchissementTauxRecomamandation0NonUrgent() {
		assertEquals(0.50,0,this.l.TarifAffranchissement(false));
	}
	@Test
	public void testAffranchissementTauxRecomamandation0Urgent() {
		assertEquals(0.80F,0,this.l.TarifAffranchissement(true));
	}
	@Test
	public void testAffranchissementTauxRecomamandation1NonUrgent() {
		this.l = new Lettre("Nimes","31400","123 rue test",10,3.5F,1);
		assertEquals(1,0,this.l.TarifAffranchissement(false));
	}
	@Test
	public void testAffranchissementTauxRecomamandation1Urgent() {
		this.l = new Lettre("Nimes","31400","123 rue test",10,3.5F,1);
		assertEquals(1.30F,0,this.l.TarifAffranchissement(true));
	}
	@Test
	public void testAffranchissementTauxRecomamandation2NonUrgent() {
		this.l = new Lettre("Nimes","31400","123 rue test",10,3.5F,2);
		assertEquals(2F,0,this.l.TarifAffranchissement(false));
	}
	@Test
	public void testAffranchissementTauxRecomamandation2Urgent() {
		this.l = new Lettre("Nimes","31400","123 rue test",10,3.5F,2);
		assertEquals(2.30F,0,this.l.TarifAffranchissement(true));
	}
	@Test
	public void testRemboursementTauxRecomamandation0() {
		assertEquals(0,0,this.l.TarifRemboursement());
	}
	@Test
	public void testRemboursementTauxRecomamandation1() {
		this.l = new Lettre("Nimes","31400","123 rue test",10,3.5F,1);
		assertEquals(1.5,0,this.l.TarifRemboursement());
	}
	@Test
	public void testRemboursementTauxRecomamandation2() {
		this.l = new Lettre("Nimes","31400","123 rue test",10,3.5F,2);
		assertEquals(15,0,this.l.TarifRemboursement());
	}
	
}
