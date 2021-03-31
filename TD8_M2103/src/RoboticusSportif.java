
public class RoboticusSportif extends Roboticus {
	private int nbPatte;
	

	public RoboticusSportif(int taille, int nbPattes) {
		super(taille);
		this.nbPatte = nbPattes;
	}

	public int getNbPatte() {
		return this.nbPatte;
	}
	

	@Override
	public int points() {
		return this.nbPatte*this.getTaille();
	}
	
	@Override
	public String toString() {
		return "RoboticusSportif [nbPatte=" + nbPatte + ", toString()=" + super.toString() + "]";
	}

}
