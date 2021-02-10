
public class PointColoré extends Point {
	
	private Couleur couleur;
	
	public PointColoré(float abscisse, float ordonnée, int r,int v, int b) throws IllegalArgumentException {
	    super(abscisse,ordonnée);
	    this.couleur= new Couleur(r,v,b);
	}
	
	public static final PointColoré POINT_ORIGINE = new PointColoré(0.0f, 0.0f, 0,0,0);
	
	public int getNuanceRouge() {
		return this.couleur.getRouge();
	}
	public int getNuanceVert() {
		return this.couleur.getVert();
	}
	public int getNuanceBleu() {
		return this.couleur.getBleu();
	}
	public void setNuanceRouge(int r) throws IllegalArgumentException {
		this.couleur.setRouge(r);
	}
	public void setNuanceVert(int v) throws IllegalArgumentException {
		this.couleur.setVert(v);
	}
	public void setNuanceBleu(int b) throws IllegalArgumentException {
		this.couleur.setBleu(b);
	}
 
	@Override
	public String toString() {		
		return super.toString() +" "+ this.couleur;
	}

}
