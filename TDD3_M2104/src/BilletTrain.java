
public class BilletTrain {
	private float distance;
	public static final float[] DISTANCE= {2F, 25F, 50F, 100F, 150F, 300F};
	public static final int[] BAREMEBORD= {10,  15,  25,   35,   60,   90};
	public static final int[] BAREMECONTROLE= {50,  50,  50,   50,   90,  120};
	public BilletTrain(float distance) throws IllegalArgumentException{
		if(distance <= DISTANCE[0]) {
			throw new IllegalArgumentException("Distance infèrieure à 2km");
		}
		this.distance=distance;
	}
	public int getTarif(boolean b) {
		if(b == true) {
			if(this.distance<=DISTANCE[1])
			return BAREMEBORD[0];
			if(this.distance<=DISTANCE[2])
			return BAREMEBORD[1];
			if(this.distance<=DISTANCE[3])
			return BAREMEBORD[2];
			if(this.distance<=DISTANCE[4])
			return BAREMEBORD[3];
			if(this.distance<=DISTANCE[5])
			return BAREMEBORD[4];
			if(this.distance>DISTANCE[5])
			return BAREMEBORD[5];
		}
		if(b == false) {
			if(this.distance<=DISTANCE[4])
			return BAREMECONTROLE[0];
			if(this.distance<=DISTANCE[5])
				return BAREMECONTROLE[4];
			if(this.distance>DISTANCE[5])
				return BAREMECONTROLE[5];
		}
		return 0;
	}

}
