
public class RoboticusSportif extends Roboticus {
	private int nbPatte;
	

	public RoboticusSportif(int taille, int nbPattes) {
		super(taille);
		this.nbPatte = nbPattes;
	}

	public int getNbPatte() {
		return nbPatte;
	}
	
	@Override
	public int points() {
		return this.nbPatte*this.getTaille();
	}

}
