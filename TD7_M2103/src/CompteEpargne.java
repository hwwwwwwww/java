
public class CompteEpargne extends CompteBancaire {
	private float taux;
	
	public CompteEpargne(float taux)throws IllegalArgumentException{
		if(taux<=0) {
			throw new IllegalArgumentException("taux nul ou négatif");
		}
		this.taux=taux;
		
	}
	public float getTaux() {
		return this.taux;
	}
}