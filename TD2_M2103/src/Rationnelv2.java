public class Rationnelv2 {
	private int num�rateur;
	private int d�nominateur;
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

	public Rationnelv2(int num�rateur, int d�nominateur) throws IllegalArgumentException {
		if(num�rateur <= 0 || d�nominateur == 0) {
			throw new IllegalArgumentException("Valeurs non valide");
		}
		this.num�rateur=num�rateur;
		this.d�nominateur=d�nominateur;
		
	}
	
	public int getNum�rateur() {
		return this.num�rateur;
	}
	
	public int getD�nominateur()  {
		return this.d�nominateur;
	}
	
	public Rationnelv2 r�duction (Rationnelv2 r) {
		
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