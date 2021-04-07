import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main (String[] args) {
		List<Figure> figures = new ArrayList<>();
		
		Point p1 = new Point(50,50);
		Point p2 = new Point(100,100);
		Point p3 = new Point(200,300);
		Point p4 = new Point(200,150);
		Point p5 = new Point(90,90);
		Point p6 = new Point(450,350);
		Point p7 = new Point(120,250);
		Point p8 = new Point(120,300);
		Point p9 = new Point(0,100);
		Figure f1 = new Rectangle(p1,p2);
		Figure f2 = new Cercle(p3,p4);
		Figure f3 = new Rectangle(p5,p6);
		Figure f4 = new Cercle(p7,p8);
		Figure f5 = new Cercle(p2,p9);
		
		figures.add(f1);
		figures.add(f2);
		figures.add(f3);
		figures.add(f4);
		figures.add(f5);
	
		FenetreFigures f = new FenetreFigures(figures);
	}

}
