
public class Robot1G extends Robot {
	public Robot1G(String nom) throws IllegalArgumentException{
		super(nom,new Position(0,0),0);
	}
	@Override
	public void seDeplacer() {
		this.pivoterDroite();
		for(int i = 0;i<10;i++) {
			this.avancer();
		}
		this.pivoterDroite();
		for(int i = 0;i<15;i++) {
			this.avancer();
		}
	}
}
