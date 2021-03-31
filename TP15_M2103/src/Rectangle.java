import java.awt.Graphics;

public class Rectangle extends Figure {

	public Rectangle(Point p1, Point p2) {
		super(p1,p2);
	}

	@Override
	public double perimetre() {
		return 2 * (this.largeur() + this.hauteur());
	}
	@Override
	public double surface() {
		return this.largeur() * this.hauteur();
	}
	
	

	@Override
	public void tracer(Graphics g) {
		g.drawRect(this.getPoint1().getX(), this.getPoint1().getY(), this.largeur(), this.hauteur());
		
	}

}
