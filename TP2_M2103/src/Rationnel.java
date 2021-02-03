public class Rationnel {
	private long numérateur;
	private long dénominateur;
	public static long pgcd(long a,long b) {
		while(a != b) {
			if(a<b) {
				b -= a;
			} else {
				a -= b;
			}
		}
		return a;
	}

	public Rationnel(long numérateur, long dénominateur) throws IllegalArgumentException {
		if(numérateur <= 0 || dénominateur == 0) {
			throw new IllegalArgumentException("Valeurs non valide");
		}
		this.numérateur=numérateur;
		this.dénominateur=dénominateur;
		
	}
	
	public long getNumérateur() {
		return this.numérateur;
	}
	
	public long getDénominateur()  {
		return this.dénominateur;
	}
	
	public Rationnel réduction () {
		return new Rationnel(this.numérateur/Rationnel.pgcd(this.numérateur, this.dénominateur)
				,this.dénominateur/Rationnel.pgcd(this.numérateur,this.dénominateur));
		
	}
	
	public Rationnel somme(Rationnel r) {
		return new Rationnel(this.numérateur*r.dénominateur + r.numérateur*this.dénominateur,
				this.dénominateur*r.dénominateur);
	}
	
	public Rationnel produit(Rationnel r) {
		return new Rationnel(this.numérateur*r.numérateur,this.dénominateur*r.dénominateur);
	}
	
	@Override
	public String toString() {
		Rationnel r = new Rationnel(this.numérateur,this.dénominateur).réduction();
         return r.numérateur + "/" + r.dénominateur;
	}
}