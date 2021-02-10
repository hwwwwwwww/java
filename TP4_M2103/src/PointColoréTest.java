import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PointColor�Test extends PointTest{
	
	private PointColor� p1;
	@Before
	public void setUp() throws Exception {
	super.setUp();
	this.p1 = new PointColor�(5.0F,2.0F,45,50,60);
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}
	@Test
	public void testPointColor�Abscisse() {
		super.testConstructeurAbscisse();
	}
	@Test
	public void testPointColor�Ordonnee() {
		super.testConstructeurOrdonnee();
	}
	@Test
	public void testPointColor�Origine() {
		assertEquals(0.0F,0,PointColor�.POINT_ORIGINE.getAbscisse());
		assertEquals(0.0F,0,PointColor�.POINT_ORIGINE.getOrdonn�e());
		assertEquals(0,PointColor�.POINT_ORIGINE.getNuanceRouge());
		assertEquals(0,PointColor�.POINT_ORIGINE.getNuanceVert());
		assertEquals(0,PointColor�.POINT_ORIGINE.getNuanceBleu());
	}
	@Test
	public void testPointColor�Translater() {
		super.testTranslater();
	}
	@Test
	public void testPointColor�MettreAEchelle() {
		super.testMettreAEchelle();
	}
	@Test
	public void testPointColor�NuanceRouge() {
		assertEquals(45,this.p1.getNuanceRouge());
	}
	@Test
	public void testPointColor�NuanceVert() {
		assertEquals(50,this.p1.getNuanceVert());
	}
	@Test
	public void testPointColor�NuanceBleu() {
		assertEquals(60,this.p1.getNuanceBleu());
	}
	@Test
	public void testPointColor�SetterNuanceRouge() {
		this.p1.setNuanceRouge(100);
		assertEquals(100,this.p1.getNuanceRouge());
	}
	@Test
	public void testPointColor�SetterNuanceVert() {
		this.p1.setNuanceVert(105);
		assertEquals(105,this.p1.getNuanceVert());
	}
	@Test
	public void testPointColor�SetterNuanceBleu() {
		this.p1.setNuanceBleu(110);
		assertEquals(110,this.p1.getNuanceBleu());
	}
		
	@Test (expected = IllegalArgumentException.class)
	public void testRougeNegatif() {
		this.p1.setNuanceRouge(-20);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testVertNegatif() {
		this.p1.setNuanceVert(-20);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testBleuNegatif() {
		this.p1.setNuanceBleu(-20);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testRougeTropGrand() {
		this.p1.setNuanceRouge(260);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testVertTropGrand() {
		this.p1.setNuanceVert(256);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testBleuTropGrand() {
		this.p1.setNuanceBleu(260);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMettreAEchelleNegatif() {
		super.testMettreAEchelleNegatif();
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMettreAEchelleNegatif2() {
		super.testMettreAEchelleNegatif2();
	}
	
	

}
