
public class Nbns {
	private double mantisse;
	private int exposant;
	/**
	 * construit un nbns
	 * 
	 * @param mantisse
	 * 		mantisse du nbns
	 * @param exposant
	 * 		exposant du nbns
	 * @throws IllegalArgumentException
	 * 			si la mantisse est inférieur à 1 ou supérieur ou égale à 10
	 */
	public Nbns(double mantisse, int exposant) throws IllegalArgumentException{
		if(mantisse >= 10 || mantisse < 1 ) {
			throw new IllegalArgumentException("mantisse invalide");
		}
		this.mantisse=mantisse;
		this.exposant=exposant;
	}
	public double getMantisse() {
		return this.mantisse;
	}
	public int getExposant() {
		return this.exposant;
	}
	public Nbns ordreGrandeur() {
		Nbns n1;
		if (this.mantisse > 5) {
			n1 = new Nbns(1,this.exposant+1);
		}else {
		    n1 = new Nbns(1,this.exposant);
		}
		return n1;
	}
	public Nbns produit(Nbns n) {
		Nbns n1;
		if (this.mantisse * n.mantisse < 10 ) {
			n1 = new Nbns(this.mantisse*n.mantisse,this.exposant+n.exposant);
		}else {
			n1 = new Nbns(this.mantisse*n.mantisse/10,this.exposant+n.exposant+1);
		}
		return n1;
	}
	@Override
	public String toString() {
		if(this.exposant<0) {
			return this.mantisse+" E"+this.exposant;
		} else if(this.exposant>0) {
			return this.mantisse+" E+"+this.exposant;
		} else {
			return this.mantisse+"";
		}
	}
}
 	