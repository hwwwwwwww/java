
public class Job {
	
	private int priorit�;
	private String nomDuJob;
	private long tempsEx�cutionEnMiliSecondes;
	
	public Job(int priorit�, String nomDuJob, long tempsEx�cutionEnMilliSecondes) {
		this.priorit� = priorit�;
		this.nomDuJob = nomDuJob;
		this.tempsEx�cutionEnMiliSecondes = tempsEx�cutionEnMilliSecondes;
	}

	public int getPriorit�() {
		return priorit�;
	}

	public String getNomDuJob() {
		return nomDuJob;
	}

	public long getTempsEx�cutionEnMilliSecondes() {
		return tempsEx�cutionEnMiliSecondes;
	}
}
