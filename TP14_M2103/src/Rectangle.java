import java.lang.Math;
public class Rectangle {
	private Point p1;
	private Point p2;
	public Rectangle(Point p1,Point p2) {
		this.p1=p1;
		this.p2=p2;
	}
	public int largeur() {
		return Math.abs(this.p2.getX()-this.p1.getX());
	}
	public int hauteur() {
		return Math.abs(this.p2.getY()-this.p1.getY());
	}
	
	public Point getPoint1() {
		return this.p1;
	}
	public Point getPoint2() {
		return this.p2;
	}
	public float perimetre() {
		return 2*(this.largeur()+this.hauteur());
	}
	public float surface() {
		return this.largeur()*this.hauteur();
	}
}
