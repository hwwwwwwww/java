public abstract class Robot {
	private String nom;
	private int direction;
	private Position position;
	public Robot(String nom, Position position, int direction)
			throws IllegalArgumentException {
		if (direction < 0 || direction > 3) {
			throw new IllegalArgumentException("Direction invalide");
		}
		this.nom = nom;
		this.position = position;
		this.direction = direction;
	}
	public String getNom() {
		return this.nom;
	}
	public int getDirection() {
		return this.direction;
	}
	public Position getPosition() {
		return this.position;
	}
	public void pivoterGauche() {
		if (this.direction == 0) {
			this.direction = 3;
		} else {
			this.direction -= 1;
		}
	}
	public void pivoterDroite() {
		this.direction = (this.direction + 1) % 4;
	}
	public void avancer() {
		switch (this.direction) {
		case 0:
			this.position.setLigne(this.position.getLigne() - 1);
			break;
		case 1:
			this.position.setColonne(this.position.getColonne() + 1);
			break;
		case 2:
			this.position.setLigne(this.position.getLigne() + 1);
			break;
		case 3:
			this.position.setColonne(this.position.getColonne() - 1);
		}
	}
	abstract public void seDeplacer();
}