
public class Segment {
		private Point origine;
		private Point extrémité;
		
		public Segment(Point origine, Point extrémité) {
			this.origine=origine;
			this.extrémité=extrémité;
		}
	
		public Point pointMilieu() {
			Point p = new Point((this.origine.getAbscisse()+this.extrémité.getAbscisse())/2,
					(this.origine.getOrdonnée()+this.extrémité.getOrdonnée())/2);
			return p;
		}
}
