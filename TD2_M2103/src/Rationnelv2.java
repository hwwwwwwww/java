public class Rationnelv2 {
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

	public Rationnelv2(long num�rateur, long d�nominateur) throws IllegalArgumentException {
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
	
	public Rationnelv2 r�duction (Rationnelv2 r) {
		return new Rationnelv2(this.num�rateur/Rationnelv2.pgcd(this.num�rateur, this.d�nominateur)
				,this.d�nominateur/Rationnelv2.pgcd(this.num�rateur,this.d�nominateur));
		
	}
	
	public Rationnelv2 somme(Rationnelv2 r) {
		return new Rationnelv2(this.num�rateur*r.d�nominateur + r.num�rateur*this.d�nominateur,
				this.d�nominateur*r.d�nominateur);
	}
	
	public Rationnelv2 produit(Rationnelv2 r) {
		return new Rationnelv2(this.num�rateur*r.num�rateur,this.d�nominateur*r.d�nominateur);
	}
	
	@Override
	public String toString() {
         return this.num�rateur + "/" + this.d�nominateur;
	}
}