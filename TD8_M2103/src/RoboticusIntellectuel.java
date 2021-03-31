
public class RoboticusIntellectuel extends Roboticus {
	private int nbNeurones;
	
	public RoboticusIntellectuel(int taille, int nbNeurones) {
		super(taille);
		this.nbNeurones = nbNeurones;
	}
	public int getNbNeurones() {
		return this.nbNeurones;
	}
	public void setNbNeurones(int nb) {
		this.nbNeurones+=nb;
	}
	public int points() {
		return this.nbNeurones*this.getTaille();
	}
	@Override
	public String toString() {
		return "RoboticusIntellectuel [nbNeurones=" + nbNeurones + ", toString()=" + super.toString() + "]";
	}
	
}
