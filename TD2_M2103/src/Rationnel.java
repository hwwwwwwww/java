
public class Rationnel {
	private int numérateur;
	private int dénominateur;
 	
	private static int pgcd(int a,int b) {
		while(a != b) {
			if(a<b) {
				b -= a;
			} else {
				a -= b;
			}
		}
		return a;
	}
	
	public Rationnel(int numérateur, int dénominateur) throws IllegalArgumentException {
		if(numérateur < 0 || dénominateur == 0) {
			throw new IllegalArgumentException("Valeurs non valide");
		}
		this.numérateur=numérateur;
		this.dénominateur=dénominateur;
	}
	
	public int getNumérateur() {
		return this.numérateur;
	}
	
	public int getDénominateur()  {
		return this.dénominateur;
	}
	
	public void réduction() {
		this.numérateur=this.numérateur/Rationnel.pgcd(this.numérateur, this.dénominateur);
		this.dénominateur=this.dénominateur/Rationnel.pgcd(this.numérateur,this.dénominateur);
	}
	
	public void somme(int a, int b) {
		this.numérateur=this.numérateur*b+a*this.dénominateur;
		this.dénominateur*=b;
	}
	
	public void produit(int a, int b) {
		this.numérateur *= a;
		this.dénominateur *= b;
	}
	
	@Override
	public String toString() {
		 return this.numérateur + "/" + this.dénominateur;
	}
}