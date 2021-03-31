
public class RoboticusSurdoue extends RoboticusIntellectuel {
	public RoboticusSurdoue(int taille, int nbNeurones) {
		super(taille, nbNeurones);
	}
	public void ajouter(int nb) {
		this.setNbNeurones(this.getNbNeurones()+nb);
	}
	@Override
	public int points() {
		return super.points()*2;
	}
	@Override
	public String toString() {
		return "RoboticusSurdoue [toString()=" + super.toString() + "]";
	}
	
}
