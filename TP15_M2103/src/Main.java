import java.awt.Graphics;

public class Main {

	public static void main(String[] args) {
		Point p1 = new Point(4,2);
		Point p2 = new Point(5,3);
		Figure f = new Rectangle(p1,p2);
		Figure f2 = new Cercle(p1,p2);
		f2.tracer(g);
	}

}
