
public class Segment {
		private Point origine;
		private Point extr�mit�;
		
		public Segment(Point origine, Point extr�mit�) {
			this.origine=origine;
			this.extr�mit�=extr�mit�;
		}
	
		public Point pointMilieu() {
			Point p = new Point((this.origine.getAbscisse()+this.extr�mit�.getAbscisse())/2,
					(this.origine.getOrdonn�e()+this.extr�mit�.getOrdonn�e())/2);
			return p;
		}
}
