public class Rationnel {
	private long num�rateur;
	private long d�nominateur;
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

	public Rationnel(long num�rateur, long d�nominateur) throws IllegalArgumentException {
		if(num�rateur <= 0 || d�nominateur == 0) {
			throw new IllegalArgumentException("Valeurs non valide");
		}
		this.num�rateur=num�rateur;
		this.d�nominateur=d�nominateur;
		
	}
	
	public long getNum�rateur() {
		return this.num�rateur;
	}
	
	public long getD�nominateur()  {
		return this.d�nominateur;
	}
	
	public Rationnel r�duction (Rationnel r) {
		return new Rationnel(this.num�rateur/Rationnel.pgcd(this.num�rateur, this.d�nominateur)
				,this.d�nominateur/Rationnel.pgcd(this.num�rateur,this.d�nominateur));
		
	}
	
	public Rationnel somme(Rationnel r) {
		return new Rationnel(this.num�rateur*r.d�nominateur + r.num�rateur*this.d�nominateur,
				this.d�nominateur*r.d�nominateur);
	}
	
	public Rationnel produit(Rationnel r) {
		return new Rationnel(this.num�rateur*r.num�rateur,this.d�nominateur*r.d�nominateur);
	}
	
	@Override
	public String toString() {
         return this.num�rateur + "/" + this.d�nominateur;
	}
}