
public class BilletTrain {
	private float distance;
	public static final int[] BAREMEBORD= {10,  15,  25,   35,   60,   90};
	public static final int[] BAREMECONTROLE= {50,  50,  50,   50,   90,  120};
	public static final float[] DISTANCE= {2F, 25F, 50F, 100F, 150F, 300F, Float.MAX_VALUE};
	public BilletTrain(float distance) throws IllegalArgumentException{
		if(distance <= DISTANCE[0]) {
			throw new IllegalArgumentException("Distance infèrieure à 2km");
		}
		this.distance=distance;
	}
	public int getTarif(boolean barêmeBord) {
		if(barêmeBord) {
			return getTarifAvecTable(BAREMEBORD);
		} else {
            return getTarifAvecTable(BAREMECONTROLE);
		}
	}
	private int getTarifAvecTable(int[] tableTarif) {
	/*if(this.distance > DISTANCE[5]) {
		return tableTarif[5];
	}
	if(this.distance > DISTANCE[4]) {
		return tableTarif[4];
	}
	if(this.distance > DISTANCE[3]) {
		return tableTarif[3];
	}
	if(this.distance > DISTANCE[2]) {
		return tableTarif[2];
	}
	if(this.distance > DISTANCE[1]) {
		return tableTarif[1];
	}
	return tableTarif[0];*/
	int i=0;
	while(this.distance> DISTANCE[i]) {
		i++;
	}
	return tableTarif[i-1];
  }
		
}
