
public class Robot2G extends Robot {
	public Robot2G(String nom,Position position)throws IllegalArgumentException {
		super(nom,position,1);
	}
	public void avancerNPas(int nbPas) throws IllegalArgumentException {
		if(nbPas < 0) {
			throw new IllegalArgumentException("nbPas négatif");
		}
		for (int i = 0; i<nbPas;i++) {
			this.avancer();
		}
	}
	public void FaireDemiTours() {
		for(int i = 0; i<2;i++) {
			this.pivoterDroite();
		}
	}
	@Override
	public void seDeplacer() {
		this.pivoterGauche();
		this.avancerNPas(10);
		this.FaireDemiTours();
		this.avancerNPas(3);
		this.pivoterDroite();
		this.avancerNPas(11);
	}
}
