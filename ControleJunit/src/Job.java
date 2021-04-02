
public class Job {
	
	private int priorité;
	private String nomDuJob;
	private long tempsExécutionEnMiliSecondes;
	
	public Job(int priorité, String nomDuJob, long tempsExécutionEnMilliSecondes) {
		this.priorité = priorité;
		this.nomDuJob = nomDuJob;
		this.tempsExécutionEnMiliSecondes = tempsExécutionEnMilliSecondes;
	}

	public int getPriorité() {
		return priorité;
	}

	public String getNomDuJob() {
		return nomDuJob;
	}

	public long getTempsExécutionEnMilliSecondes() {
		return tempsExécutionEnMiliSecondes;
	}
}
