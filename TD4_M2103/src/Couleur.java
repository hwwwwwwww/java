
public class Couleur {
	
	 private int rouge;
	 private int vert;
	 private int bleu;
	
	 public Couleur(int rouge, int vert, int bleu) throws IllegalArgumentException {
			 this.setRouge(rouge);
			 this.setVert(vert);
			 this.setBleu(bleu);
	 }
	 public static final Couleur ROUGE = new Couleur (255, 0, 0);
	 public static final Couleur VERT = new Couleur (0, 255, 0);
	 public static final Couleur BLEU = new Couleur (0, 0, 255);
	 
	 public int getRouge() {
		 	return (this.rouge);
	 }
	
	 public int getVert() {
		 	return (this.vert);
	 }
	
	 public int getBleu() {
		 	return (this.bleu);
	 }
	
	 public int valeurRVB() {
		 	return this.rouge * 256 * 256 + this.vert * 256 + this.bleu;
	 }
	
	 public void setRouge(int rouge) throws IllegalArgumentException {
			 if (rouge < 0 || rouge > 255) {
			 throw new IllegalArgumentException("mauvaise nuance de rouge");
			 }
			 this.rouge = rouge;
	 }
	
	 public void setVert(int vert) throws IllegalArgumentException {
			 if (vert < 0 || vert > 255) {
			 throw new IllegalArgumentException("mauvaise nuance de vert");
			 }
			 this.vert = vert;
	 }
	
	 public void setBleu(int bleu) throws IllegalArgumentException {
			 if (bleu < 0 || bleu > 255) {
			 throw new IllegalArgumentException("mauvaise nuance de bleu");
			 }
			 this.bleu = bleu;
	 }
	   public void couleurComplémentaire() {
		 	this.rouge = 255 - this.rouge;
		 	this.vert = 255 - this.vert;
		 	this.bleu = 255 - this.bleu;
	 }
	 @Override
	 public String toString() {
		 return "["+this.rouge+","+this.vert+","+this.bleu+"]";
	 }
}
