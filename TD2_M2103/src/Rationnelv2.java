public class Rationnelv2 {
	private long numérateur;
	private long dénominateur;
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

	public Rationnelv2(long numérateur, long dénominateur) throws IllegalArgumentException {
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
	
	public Rationnelv2 réduction (Rationnelv2 r) {
		return new Rationnelv2(this.numérateur/Rationnelv2.pgcd(this.numérateur, this.dénominateur)
				,this.dénominateur/Rationnelv2.pgcd(this.numérateur,this.dénominateur));
		
	}
	
	public Rationnelv2 somme(Rationnelv2 r) {
		return new Rationnelv2(this.numérateur*r.dénominateur + r.numérateur*this.dénominateur,
				this.dénominateur*r.dénominateur);
	}
	
	public Rationnelv2 produit(Rationnelv2 r) {
		return new Rationnelv2(this.numérateur*r.numérateur,this.dénominateur*r.dénominateur);
	}
	
	@Override
	public String toString() {
         return this.numérateur + "/" + this.dénominateur;
	}
}