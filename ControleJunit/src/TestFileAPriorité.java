import static org.junit.Assert.*;
import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFileAPriorit� {
	private FileAPriorit� f;
	@Before
	public void setUp() throws Exception {
		this.f = new FileAPriorit�(3);
	}

	@After
	public void tearDown() throws Exception {
		this.f = null;
	}

	@Test(expected= IllegalArgumentException.class)
	public void testFileAvecUnNombreNegatifDePriorit�s() {
		this.f = new FileAPriorit�(-10);
	}
	@Test(expected= IllegalArgumentException.class)
	public void testFileAvecUnNombreAZeroDePriorit�s() {
		this.f = new FileAPriorit�(0);
	}
	@Test(expected= IllegalArgumentException.class)
	public void testFileAvecUnNombreDePriorit�sExcessifs() {
		this.f = new FileAPriorit�(100);
	}

	@Test
	public void testLesFilesAPriorit�SontNonNulles() {
		assertFalse(this.f==null);
	}

	@Test
	public void testEtLesFilesAPriorit�SontVides() {
		assertTrue(this.f.estVide());
	}

	@Test(expected= IllegalArgumentException.class)
	public void testAjoutDunJobPriorit�Inf�rieurOuEgalAZero() {
		Job j = new Job(-1, "job1", 10);
		this.f.ajouterUnJobAPrioriser(j);
	}
	@Test(expected= IllegalArgumentException.class)
	public void testAjoutDunJobPriorit�Inf�rieurOuEgalAZero2() {
		Job j = new Job(0, "job1", 10);
		this.f.ajouterUnJobAPrioriser(j);
	}

	@Test(expected= IllegalArgumentException.class)
	public void testAjoutDunJobPriorit�Sup�rieurACapacit�DeLaFileAPriorit� () {
		Job j = new Job(120, "job1", 10);
		this.f.ajouterUnJobAPrioriser(j);	
		}
	@Test
	public void testFileAPriorit�GlobalementVideApresCreation() {
		assertTrue(this.f.estVide());
	}
	@Test
	public void testFileAPriorit�GlobalementNonVideApresCreationEtAjoutDunJob() {
		Job j = new Job(2, "job1", 10);
		this.f.ajouterUnJobAPrioriser(j);	
		assertFalse(this.f.estVide());
	}
	@Test(expected= NoSuchElementException.class)
	public void testConsommationDunJobSurUneFileAPrioriteGlobalementVide() {
		this.f.consommerPremierJobPlusGrandePriorit�();
	}
	@Test
	public void testConsommationDeJobsParPriorit�D�croissante() {
		Job j = new Job(3, "job1", 10);
		Job j1 = new Job(1, "job2", 10);
		Job j2 = new Job(1, "job3", 10);
		this.f.ajouterUnJobAPrioriser(j);
		this.f.ajouterUnJobAPrioriser(j1);
		this.f.ajouterUnJobAPrioriser(j2);
		this.f.consommerLesJobsParPriorit�D�croissante();
		

	}
	@Test
	public void testConsommationDeTousLesJobsAvecTempsDexecution() {
	}

	

	


}
