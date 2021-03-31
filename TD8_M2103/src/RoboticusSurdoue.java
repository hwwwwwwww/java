
public class RoboticusSurdoue extends RoboticusIntellectuel {
	public RoboticusSurdoue(int taille, int nbNeurones) {
		super(taille, nbNeurones);
	}
	@Override
	public int points() {
		return super.points()*2;
	}
}
