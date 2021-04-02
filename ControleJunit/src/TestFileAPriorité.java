import static org.junit.Assert.*;
import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFileAPriorité {
	private FileAPriorité f;
	@Before
	public void setUp() throws Exception {
		this.f = new FileAPriorité(3);
	}

	@After
	public void tearDown() throws Exception {
		this.f = null;
	}

	@Test(expected= IllegalArgumentException.class)
	public void testFileAvecUnNombreNegatifDePriorités() {
		this.f = new FileAPriorité(-10);
	}
	@Test(expected= IllegalArgumentException.class)
	public void testFileAvecUnNombreAZeroDePriorités() {
		this.f = new FileAPriorité(0);
	}
	@Test(expected= IllegalArgumentException.class)
	public void testFileAvecUnNombreDePrioritésExcessifs() {
		this.f = new FileAPriorité(100);
	}

	@Test
	public void testLesFilesAPrioritéSontNonNulles() {
		assertFalse(this.f==null);
	}

	@Test
	public void testEtLesFilesAPrioritéSontVides() {
		assertTrue(this.f.estVide());
	}

	@Test(expected= IllegalArgumentException.class)
	public void testAjoutDunJobPrioritéInférieurOuEgalAZero() {
		Job j = new Job(-1, "job1", 10);
		this.f.ajouterUnJobAPrioriser(j);
	}
	@Test(expected= IllegalArgumentException.class)
	public void testAjoutDunJobPrioritéInférieurOuEgalAZero2() {
		Job j = new Job(0, "job1", 10);
		this.f.ajouterUnJobAPrioriser(j);
	}

	@Test(expected= IllegalArgumentException.class)
	public void testAjoutDunJobPrioritéSupérieurACapacitéDeLaFileAPriorité () {
		Job j = new Job(120, "job1", 10);
		this.f.ajouterUnJobAPrioriser(j);	
		}
	@Test
	public void testFileAPrioritéGlobalementVideApresCreation() {
		assertTrue(this.f.estVide());
	}
	@Test
	public void testFileAPrioritéGlobalementNonVideApresCreationEtAjoutDunJob() {
		Job j = new Job(2, "job1", 10);
		this.f.ajouterUnJobAPrioriser(j);	
		assertFalse(this.f.estVide());
	}
	@Test(expected= NoSuchElementException.class)
	public void testConsommationDunJobSurUneFileAPrioriteGlobalementVide() {
		this.f.consommerPremierJobPlusGrandePriorité();
	}
	@Test
	public void testConsommationDeJobsParPrioritéDécroissante() {
		Job j = new Job(3, "job1", 10);
		Job j1 = new Job(1, "job2", 10);
		Job j2 = new Job(1, "job3", 10);
		this.f.ajouterUnJobAPrioriser(j);
		this.f.ajouterUnJobAPrioriser(j1);
		this.f.ajouterUnJobAPrioriser(j2);
		this.f.consommerLesJobsParPrioritéDécroissante();
		

	}
	@Test
	public void testConsommationDeTousLesJobsAvecTempsDexecution() {
	}

	

	


}
