
public class Lettre {
	private String origine;
	private String cp;
	private int poids;
	private float volume;
	private int tauxR;
	public Lettre(String origine, String cp, String destination, int poids, float volume, int tauxR)throws IllegalArgumentException {
		if(tauxR < 0 || tauxR > 2) {
			throw new IllegalArgumentException("taux recommandation non valide");		
			}
		this.origine=origine;
		this.cp=cp;
		this.poids=poids;
		this.volume=volume;
		this.tauxR=tauxR;

	}
	public float TarifAffranchissement(boolean urgent) {
		final float tarifDeBase = 0.5F;
		final float tarifCaractereUrgence = 0.3F;
		if(!urgent) {
			if(this.tauxR == 0) {
				return tarifDeBase;
			}
			if(this.tauxR == 1) {
				return tarifDeBase + 0.5F;
			} 
			if(this.tauxR == 2) {
				return tarifDeBase + 1.5F;
			} 
		 }else {
				if(this.tauxR == 0) {
					return tarifDeBase + tarifCaractereUrgence;
				}
				if(this.tauxR == 1) {
					return tarifDeBase + tarifCaractereUrgence + 0.5F;
				}
				if(this.tauxR == 2) {
					return tarifDeBase + tarifCaractereUrgence + 1.5F;
				}
			}
		return tarifDeBase;
	}
	public float TarifRemboursement() {
		if(this.tauxR == 0) {
			return 0;
		}
		if(this.tauxR == 1) {
			return 1.5F;
		}
		if(this.tauxR == 2) {
			return 15;
		}
		return 0;
	}

}
