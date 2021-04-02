import java.util.ArrayList;
import java.util.NoSuchElementException;

public class FileAPriorit� {
	
	public static final int PRIORITE_MAX_GEREE = 99;
	public final int nbPriorit�sG�r�es;
	private ArrayList<File<Job>> lesJobsClass�sParPriorit�;

	public FileAPriorit�(int nbPriorit�sG�r�es) {
		if (nbPriorit�sG�r�es < 1 || nbPriorit�sG�r�es > PRIORITE_MAX_GEREE)
			throw new IllegalArgumentException("Le nombre de files de priorit� doit �tre compris entre 1 et 99");
		this.nbPriorit�sG�r�es = nbPriorit�sG�r�es;
		this.lesJobsClass�sParPriorit� = new ArrayList<File<Job>>(nbPriorit�sG�r�es);
		cr�erUneFileParPriorit�();
	}

	private void cr�erUneFileParPriorit�() {
		for (int i = 0; i < this.nbPriorit�sG�r�es; i++)
			this.lesJobsClass�sParPriorit�.add(new File<Job>());
	}
	
	File<Job> getFileDeJobsDePriorit�(int priorit�) {
		return this.lesJobsClass�sParPriorit�.get(priorit�);
	}
	
	public void ajouterUnJobAPrioriser(Job unJob) {
		if (unJob.getPriorit�() < 1 || unJob.getPriorit�() > this.nbPriorit�sG�r�es)
			throw new IllegalArgumentException("le job n'a pas une priorit� correcte comprise entre 1 et " + this.nbPriorit�sG�r�es);
		this.lesJobsClass�sParPriorit�.get(unJob.getPriorit�()-1).enfiler(unJob);
	}
	
	public boolean estVide() {
		for (File<Job> file : this.lesJobsClass�sParPriorit�) {
			if (!file.estVide())
				return false;
		}
		return true;	
	}

	public Job consommerPremierJobPlusGrandePriorit�() {
		if (this.estVide())
			throw new NoSuchElementException("Plus de job � traiter");
		for (int priorit� = this.nbPriorit�sG�r�es -1; priorit� >= 0; priorit�--) {
			if (!this.getFileDeJobsDePriorit�(priorit�).estVide())
				return this.getFileDeJobsDePriorit�(priorit�).d�filer();
		}
		return null;
	}
	
	public long consommerLesJobsParPriorit�D�croissante() {
		long tempsEx�cution = 0;
		while (!this.estVide()) {
			tempsEx�cution += this.consommerPremierJobPlusGrandePriorit�().getTempsEx�cutionEnMilliSecondes();
		}
		return tempsEx�cution;
	}
}
