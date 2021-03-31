import java.lang.Math;
public class Cercle {
	private Point p1;
	private Point p2;
	public Cercle(Point p1, Point p2) {
		this.p1=p1;
		this.p2=p2;
	}
	public double rayon() {
	 return Point.distance(this.p1, this.p2);
	}
	public double diamètre() {
		return this.rayon()*2;
	}
	public Point getPoint1() {
		return this.p1;
	}
	public Point getPoint2() {
		return this.p2;
	}
	public double périmètre() {
		return 2*Math.PI*this.rayon();
	}
	public double surface() {
		return Math.PI*Math.pow(this.rayon(), 2);
	}
}
