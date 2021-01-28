public class Rationnelv2 {
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

	public Rationnelv2(int numérateur, int dénominateur) throws IllegalArgumentException {
		if(numérateur <= 0 || dénominateur == 0) {
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
	
	public Rationnelv2 réduction (Rationnelv2 r) {
		
	}
	
	public Rationnelv2 somme(Rationnelv2 r) {
		
	}
	
	public Rationnelv2 produit(Rationnelv2 r) {

	}
	
	@Override
	public String toString() {
         return "test";
	}
}