
public class Point {
	private float abscisse;
	private float ordonnée;
	
	public Point(float abscisse,float ordonnée) {
		this.abscisse=abscisse;
		this.ordonnée=ordonnée;
	}
	public float getAbscisse() {
		return this.abscisse;
	}
	public float getOrdonnée() {
		return this.ordonnée;
	}
	public void translater(float a,float o) {
		this.abscisse+=a;
		this.ordonnée+=o;
	}
	public void mettreAEchelle(float h){
		if(h>0) {
			this.abscisse*=h;
			this.ordonnée*=h;
		}
	}
	@Override
	public String toString() {
		return "("+this.abscisse+" ; "+this.ordonnée+")";
	}
}

