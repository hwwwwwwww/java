import java.util.ArrayList;
import java.util.NoSuchElementException;

public class FileAPriorité {
	
	public static final int PRIORITE_MAX_GEREE = 99;
	public final int nbPrioritésGérées;
	private ArrayList<File<Job>> lesJobsClassésParPriorité;

	public FileAPriorité(int nbPrioritésGérées) {
		if (nbPrioritésGérées < 1 || nbPrioritésGérées > PRIORITE_MAX_GEREE)
			throw new IllegalArgumentException("Le nombre de files de priorité doit être compris entre 1 et 99");
		this.nbPrioritésGérées = nbPrioritésGérées;
		this.lesJobsClassésParPriorité = new ArrayList<File<Job>>(nbPrioritésGérées);
		créerUneFileParPriorité();
	}

	private void créerUneFileParPriorité() {
		for (int i = 0; i < this.nbPrioritésGérées; i++)
			this.lesJobsClassésParPriorité.add(new File<Job>());
	}
	
	File<Job> getFileDeJobsDePriorité(int priorité) {
		return this.lesJobsClassésParPriorité.get(priorité);
	}
	
	public void ajouterUnJobAPrioriser(Job unJob) {
		if (unJob.getPriorité() < 1 || unJob.getPriorité() > this.nbPrioritésGérées)
			throw new IllegalArgumentException("le job n'a pas une priorité correcte comprise entre 1 et " + this.nbPrioritésGérées);
		this.lesJobsClassésParPriorité.get(unJob.getPriorité()-1).enfiler(unJob);
	}
	
	public boolean estVide() {
		for (File<Job> file : this.lesJobsClassésParPriorité) {
			if (!file.estVide())
				return false;
		}
		return true;	
	}

	public Job consommerPremierJobPlusGrandePriorité() {
		if (this.estVide())
			throw new NoSuchElementException("Plus de job à traiter");
		for (int priorité = this.nbPrioritésGérées -1; priorité >= 0; priorité--) {
			if (!this.getFileDeJobsDePriorité(priorité).estVide())
				return this.getFileDeJobsDePriorité(priorité).défiler();
		}
		return null;
	}
	
	public long consommerLesJobsParPrioritéDécroissante() {
		long tempsExécution = 0;
		while (!this.estVide()) {
			tempsExécution += this.consommerPremierJobPlusGrandePriorité().getTempsExécutionEnMilliSecondes();
		}
		return tempsExécution;
	}
}
