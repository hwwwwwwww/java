public class Monome {

    /**
     * coefficient du mon�me
     */
    private float coefficient;

    /**
     * exposant du mon�me
     */
    private int exposant;

    /**
     * construit un mon�me
     * 
     * @param coefficient
     *            coefficient du mon�me
     * @param exposant
     *            exposant du mon�me
     * @exception IllegalArgumentException
     *                si l'exposant est n�gatif
     */
    public Monome(float coefficient, int exposant)
            throws IllegalArgumentException {
    	if(exposant < 0) {
    		throw new IllegalArgumentException("exposant n�gatif");
    	}
    	this.exposant =exposant;
    	this.coefficient=coefficient;
    }

    /**
     * retourne le coefficient d'un mon�me
     * 
     * @return coefficient
     */
    public float getCoefficient() {
        return this.coefficient;
    }

    /**
     * retourne l'exposant d'un mon�me
     * 
     * @return exposant
     */
    public int getExposant() {
        return this.exposant;
    }

    /**
     * calcule la somme de deux mon�mes
     * 
     * @param m
     *            deuxi�me op�rande de la somme
     * @return mon�me r�sultat
     * @exception ArithmeticException
     *                si les exposants des 2 mon�mes ne sont pas les m�mes
     */
    public Monome somme(Monome m) throws ArithmeticException {
        if(this.exposant != m.exposant) {
        	throw new ArithmeticException("exposants non �gaux");
        }
       m = new Monome(this.coefficient+=m.coefficient,this.exposant);
        return m;
    }

    /**
     * calcule le produit de deux mon�mes
     * 
     * @param m
     *            deuxi�me op�rande du produit
     * @return mon�me r�sultat
     */
    public Monome produit(Monome m) {
        m = new Monome(this.coefficient*=m.coefficient,this.exposant+=m.exposant);
        return m;
    }

    /**
     * calcule la d�riv�e d'un mon�me
     * 
     * @return mon�me r�sultat
     */
    public Monome d�riv�e() {
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
     * produit une version unicode d'un mon�me
     * 
     * @return cha�ne r�sultat
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
     * teste si un mon�me est nul
     * 
     * @return true si le mon�me est nul
     */
    public boolean estNul() {
    	if(this.coefficient==0.0F) {
			return true;
		}else {
			return false;
		}
    }

}