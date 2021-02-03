
public class Point {
	private float abscisse;
	private float ordonn�e;
	
	public Point(float abscisse,float ordonn�e) {
		this.abscisse=abscisse;
		this.ordonn�e=ordonn�e;
	}
	
	public static final Point POINT_ORIGINE = new Point(0,0);
	
	public float getAbscisse() {
		return this.abscisse;
	}
	public float getOrdonn�e() {
		return this.ordonn�e;
	}
	public void translater(float a,float o) {
		this.abscisse+=a;
		this.ordonn�e+=o;
	}
	public void mettreAEchelle(float h){
		if(h>0) {
			this.abscisse*=h;
			this.ordonn�e*=h;
		}
	}
	@Override
	public String toString() {
		return "("+this.abscisse+" ; "+this.ordonn�e+")";
	}
}

