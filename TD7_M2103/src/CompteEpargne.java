
public class CompteEpargne extends CompteBancaire {
	private float taux;
	
	public CompteEpargne(String numero, float taux)throws IllegalArgumentException{
		super(numero);
		if(taux<=0) {
			throw new IllegalArgumentException("taux nul ou négatif");
		}
		this.taux=taux;
	}
	public float getTaux() {
		return this.taux;
	}
	public float interets() {
		if(this.solde()>0) {
			return this.solde()*this.taux;
		}else {
			return 0.0F;
		}
	}
	public void ajouterInterets() {
		this.deposer(this.interets());
	}
	@Override
	public String toString() {
		return super.toString()+", Taux : " + this.taux + "%";
	}
}