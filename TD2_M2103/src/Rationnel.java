
public class Rationnel {
	private int numérateur;
	private int dénominateur;
 	
	private static long pgcd(long a,long b) {
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
         return "test";
	}
}