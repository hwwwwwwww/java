import java.awt.Graphics;

public abstract class Figure {
	private Point p1;
	private Point p2;
	public Figure(Point p1, Point p2) {
		this.p1=p1;
		this.p2=p2;
	}

	public abstract double perimetre();
	
	public abstract double surface();
	
	public double rayon() {
		 return Point.distance(this.p1, this.p2);
		}
	public double diametre() {
		return this.rayon()*2;
	}
	
	public int hauteur() {
		return Math.abs(this.p2.getY() - this.p1.getY());
	}

	public int largeur() {
		return Math.abs(this.p2.getX() - this.p1.getX());
	}
	
	public Point getPoint1() {
		return this.p1;
	}
	public Point getPoint2() {
		return this.p2;
	}
	
	public abstract void tracer(Graphics g);
}
