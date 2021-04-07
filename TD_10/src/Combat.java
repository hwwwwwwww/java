import java.util.ArrayList;
import java.util.List;

public class Combat {
	private Position cible;
	private List<Robot> robots;
	
	public Combat() {
		this.robots = new ArrayList<>();
		this.cible= new Position(0,0);
	}
	public void ajouterRobot(Robot r) {
		this.robots.add(r);
	}
	public void setCible(Position p) {
		this.cible = p;
	}
	public boolean cibleAtteinte() {
		for(Robot r : this.robots) {
			if(r.getPosition().equals(this.cible)) {
				return true;
			}
		}
		return false;
	}
	public void combattre() {
		int i = 0;
		while(!this.cibleAtteinte() && i < 100) {
			for(Robot r : this.robots) {
				r.seDeplacer();
			}
			i++;
		}
		if(this.cibleAtteinte()) {
			System.out.println("Il a fallu " + i + "essais pour atteindre la cible");
			for(Robot r : this.robots) {
				if(r.getPosition().equals(this.cible)){
					System.out.println(r.getNom());
				}
			}
		}else {
			System.out.println("Cible non atteinte");
		}
	}
}
