
public class RoboticusIntellectuel extends Roboticus {
	private int nbNeurones;
	
	public RoboticusIntellectuel(int taille, int nbNeurones) {
		super(taille);
		this.nbNeurones = nbNeurones;
	}
	public int getNbNeurones() {
		return nbNeurones;
	}
	public int points() {
		return this.nbNeurones*this.points();
	}
}
