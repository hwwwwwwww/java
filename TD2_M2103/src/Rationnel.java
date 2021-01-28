
public class Rationnel {
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
	
	public Rationnel(int num�rateur, int d�nominateur) throws IllegalArgumentException {
		if(num�rateur < 0 || d�nominateur == 0) {
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
	
	public void r�duction() {
		
	}
	
	public void somme(int a, int b) {
		this.num�rateur=this.num�rateur*b+a*this.d�nominateur;
		this.d�nominateur*=b;
	}
	
	public void produit(int a, int b) {
		this.num�rateur *= a;
		this.d�nominateur *= b;
	}
	
	@Override
	public String toString() {
         return "test";
	}
}