public class Monome {

    /**
     * coefficient du monôme
     */
    private float coefficient;

    /**
     * exposant du monôme
     */
    private int exposant;

    /**
     * construit un monôme
     * 
     * @param coefficient
     *            coefficient du monôme
     * @param exposant
     *            exposant du monôme
     * @exception IllegalArgumentException
     *                si l'exposant est négatif
     */
    public Monome(float coefficient, int exposant)
            throws IllegalArgumentException {
    	if(exposant < 0) {
    		throw new IllegalArgumentException("exposant négatif");
    	}
    	this.exposant =exposant;
    	this.coefficient=coefficient;
    }

    /**
     * retourne le coefficient d'un monôme
     * 
     * @return coefficient
     */
    public float getCoefficient() {
        return this.coefficient;
    }

    /**
     * retourne l'exposant d'un monôme
     * 
     * @return exposant
     */
    public int getExposant() {
        return this.exposant;
    }

    /**
     * calcule la somme de deux monômes
     * 
     * @param m
     *            deuxième opérande de la somme
     * @return monôme résultat
     * @exception ArithmeticException
     *                si les exposants des 2 monômes ne sont pas les mêmes
     */
    public Monome somme(Monome m) throws ArithmeticException {
        if(this.exposant != m.exposant) {
        	throw new ArithmeticException("exposants non égaux");
        }
       m = new Monome(this.coefficient+=m.coefficient,this.exposant);
        return m;
    }

    /**
     * calcule le produit de deux monômes
     * 
     * @param m
     *            deuxième opérande du produit
     * @return monôme résultat
     */
    public Monome produit(Monome m) {
        m = new Monome(this.coefficient*=m.coefficient,this.exposant+=m.exposant);
        return m;
    }

    /**
     * calcule la dérivée d'un monôme
     * 
     * @return monôme résultat
     */
    public Monome dérivée() {
    	if (this.exposant == 0) {
			this.coefficient = 0.0F;
			this.exposant=0;
		}else {
			this.coefficient *= this.exposant;
			this.exposant -=1;
		}
    	Monome m = new Monome(this.coefficient,this.exposant);
    	return m;
    }

    /**
     * produit une version unicode d'un monôme
     * 
     * @return chaîne résultat
     */
    @Override
    public String toString() {
        if (this.estNul()) {
            return "0";
        } else {
            if (this.exposant == 0) {
                return "" + this.getCoefficient();
            }
            return "" + this.getCoefficient() + "xe" + this.getExposant();
        }
    }

    /**
     * teste si un monôme est nul
     * 
     * @return true si le monôme est nul
     */
    public boolean estNul() {
    	if(this.coefficient==0.0F) {
			return true;
		}else {
			return false;
		}
    }

}