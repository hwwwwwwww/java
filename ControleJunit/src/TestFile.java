import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFile<T> {
	
	private File<T> f;
	T element;

	@Before
	public void setUp() throws Exception {
		this.f = new File<T>();
	}

	@After
	public void tearDown() throws Exception {
		this.f = null;
	}
	@Test
	public void testEstVideApresCreation() {
		assertTrue(this.f.estVide());
		
	}
	@Test
	public void testNestPlusVideApresAvoirEnfileUnElement() {
		this.f.enfiler(element);
		assertFalse(this.f.estVide());
		
	}
	@Test
	public void testEstVideApresCreationEnfilageEtConsommationDeTousLesElements() {
		assertTrue(this.f.estVide());
		this.f.enfiler(element);
		this.f.enfiler(element);
		assertFalse(this.f.estVide());
		this.f.défiler();
		this.f.défiler();
		assertTrue(this.f.estVide());
	
	}
	@Test
	public void testOnIncrementeBienLeNombreDElementsLorsquOnAjouteApresDernier() {
		assertEquals(0, this.f.nbElements());
		this.f.enfiler(element);
		assertEquals(1, this.f.nbElements());
		this.f.enfiler(element);
		assertEquals(2, this.f.nbElements());

	}
	@Test
	public void testOnDecrementeBienLeNombreDElementsLorquOnConsommeLesPremiers() {
		this.f.enfiler(element);
		this.f.enfiler(element);
		assertEquals(2, this.f.nbElements());
		this.f.défiler();
		assertEquals(1, this.f.nbElements());

	}
	@Test
	public void testUneFileSeCaracteriseParFirstInFirstOut() {
		this.f.enfiler(element);
		this.f.enfiler(element);
		assertEquals(2, this.f.nbElements());
		this.f.défiler();
		assertEquals(1, this.f.nbElements());
	}
	@Test(expected= NoSuchElementException.class)
	public void testOnNePeutConsommerUnElemenDuneFileVide () {
		assertTrue(this.f.estVide());
		this.f.défiler();
	}
}
