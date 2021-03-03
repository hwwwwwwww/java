
public class Polynome {
	public static final int DEGRE_MAX = 99;
	private float [] coefficients;
	
	public Polynome() {
     this.coefficients= new float [Polynome.DEGRE_MAX+1]; 
     for(int i = 0; i<=Polynome.DEGRE_MAX;i++) {
    	 this.coefficients[i]=0.0F;
     }
	}
	
	public void setMonone(Monome m) throws IllegalArgumentException{
		if(m.getExposant()>Polynome.DEGRE_MAX){
			throw new IllegalArgumentException("exposant trop grand");
		}
		this.coefficients[m.getExposant()]=m.getCoefficient();
		
	}
	public Monome getMonome(int e)throws IllegalArgumentException {
		if(e<0 || e>Polynome.DEGRE_MAX) {
			throw new IllegalArgumentException("exposant négatif");
		}
		return new Monome(this.coefficients[e],e);
	}
	
	public Polynome somme(Polynome p) {
		Polynome p1 = new Polynome();
		for(int i = 0; i<=Polynome.DEGRE_MAX;i++){
		float somme =this.coefficients[i]+=p.coefficients[i];
		p1.coefficients[i]=somme;
		}
		return p1;
	}
    public void produit(Monome m) {
		for(int i = 0; i<=Polynome.DEGRE_MAX;i++){
			if(this.coefficients[i]!=0) {
			this.coefficients[i]*=m.getCoefficient();
		}
		}
    }
    public void dérivée() {
    	
    }
    @Override
    public String toString() {
    	return " " ;
    }
}
