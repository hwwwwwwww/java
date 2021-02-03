
public class Durée {
	private int heures;
	private int minutes;
	private int secondes;
	
	public Durée(int heures,int minutes,int secondes) throws IllegalArgumentException {
		if(heures < 0 ) {
			throw new IllegalArgumentException("h invalide");
		}else if(minutes > 59 || minutes < 0) {
			throw new IllegalArgumentException("m invalide");
		}else if(secondes > 59 || secondes < 0) {
			throw new IllegalArgumentException("s invalide");
		}
		this.heures=heures;
		this.minutes=minutes;
		this.secondes=secondes;
	}
	
	public int getHeures() {
		return this.heures;
	}
	public int getMinutes() {
		return this.minutes;
	}
	public int getSecondes() {
		return this.secondes;
	}
	
	public boolean égal(Durée r) {
		if(this.heures==r.heures && this.minutes==r.minutes &&
				this.secondes== r.secondes) {
			return true;
		} else {
			return false;
		}
	}
	public boolean inf(Durée r) {
		if(this.heures<r.heures || 
				this.heures==r.heures && this.minutes < r.minutes ||
				this.heures==r.heures && this.minutes == r.minutes &&
				this.secondes<r.secondes){
      return true;
	}else {
		return false;
	}
 }
	public void ajouterUneSeconde() {
		if(this.secondes<59) {
			this.secondes+=1;
		}else if(this.minutes<59) {
			this.minutes+=1;
			this.secondes=0;
		}else {
			this.heures+=1;
			this.minutes=0;
			this.secondes=0;
		}
	}
	@Override
	public String toString() {
		return this.heures+":"+this.minutes+":"+this.secondes;
	}
	
	
}