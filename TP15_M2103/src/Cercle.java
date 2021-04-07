import java.awt.Graphics;

public class Cercle extends Figure{

	public Cercle(Point p1, Point p2) {
		super(p1,p2);
	}

	@Override
	public double perimetre() {
		return 2*Math.PI*this.rayon();
	}
	@Override
	public double surface() {
		return Math.PI*Math.pow(this.rayon(), 2);
	}

	@Override
	public void tracer(Graphics g) {
		int x = this.getPoint1().getX()-(this.hauteur()/2);
		int y = this.getPoint1().getY()-(this.hauteur()/2);
		g.drawOval(x,y, this.largeur(), this.hauteur());
		 
	}
}
