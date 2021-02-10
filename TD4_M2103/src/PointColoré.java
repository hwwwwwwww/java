
public class PointColor� extends Point {
	
	private Couleur couleur;
	
	public PointColor�(float abscisse, float ordonn�e, int r,int v, int b) throws IllegalArgumentException {
	    super(abscisse,ordonn�e);
	    this.couleur= new Couleur(r,v,b);
	}
	
	public static final PointColor� POINT_ORIGINE = new PointColor�(0.0f, 0.0f, 0,0,0);
	
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
