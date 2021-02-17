public class Monome {
	/**
	 * coefficient du monome
	 */
	private float coefficient;
	/**
	 * exposant du monome
	 */
	private int exposant;
	/**
	 *  construit un monome
	 * @param coefficient
	 * @param exposant
	 * @throws IllegalArgumentException
	 * si l'exposant est n�gatif
	 */
	public Monome(float coefficient, int exposant)throws IllegalArgumentException{
		if(exposant < 0) {
			throw new IllegalArgumentException("exposant n�gatif");
		}
		this.coefficient=coefficient;
		this.exposant=exposant;
	}
	/**
	 * retourne le coefficient du monome
	 * @return coefficient
	 */
	public float getCoefficient() {
		return this.coefficient;
	}
	/**
	 * retorune l'exposant du monome
	 * @return exposant
	 */
	public int getExposant() {
		return this.exposant;
	}
	/**
	 * calcul la somme de 2 deux monome
	 * @param m deuxieme monome 
	 * @throws ArithmeticException
	 * si les deux exposants ne sont pas �gaux
	 */
	public void somme(Monome m) throws ArithmeticException{
		if(this.exposant != m.exposant) {
			throw new ArithmeticException("exposants non �gaux");
		}
		this.coefficient += m.coefficient;		
	}
	/**
	 * calcul le produit de deux monomes
	 * @param m m 2�me op�rande du produit
	 * @return
	 */
	public void produit(Monome m) {
		this.coefficient *= m.coefficient;
		this.exposant +=m.exposant;
	}
	/**
	 * calcul la d�riv�e de deux monomes
	 */
	public void d�riv�e() {
		if (this.exposant == 0) {
			this.coefficient = 0.0F;
			this.exposant=0;
		}else {
			this.coefficient *= this.exposant;
			this.exposant -=1;
		}
	} 
	/**
	 * v�rifie si un monome est nul ou pas
	 * @return true si le monome est nul, false si il ne l'est pas
	 */
	public boolean estNul() {
		if(this.coefficient==0.0F) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return this.coefficient+"xe"+this.exposant;
	}
	
}