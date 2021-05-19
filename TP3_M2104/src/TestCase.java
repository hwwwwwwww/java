import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCase {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCaseNormale() {
		CaseNormale c = new CaseNormale(0);
		assertEquals(3,c.nouvellePosition(3));
	}
	@Test
	public void testCaseAttente() {
		CaseAttente c = new CaseAttente(0,2);
		assertEquals(2,c.nouvellePosition(2));
		assertEquals(0,c.nouvellePosition(1));
	}
	@Test
	public void testCaseSaut() {
		CaseSaut c = new CaseSaut(0,1,10);
		assertEquals(10,c.nouvellePosition(1));
		assertEquals(2,c.nouvellePosition(2));
	}
	@Test
	public void testCasePaireOuImpaire() {
		CasePaireOuImpaire c = new CasePaireOuImpaire(5);
		assertEquals(11,c.nouvellePosition(6));
		assertEquals(0,c.nouvellePosition(5));
	} 
 
}
