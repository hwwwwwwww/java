

public class Robot3G extends Robot2G{
	private boolean turbo;
	public Robot3G(String nom,Position position)throws IllegalArgumentException {
		super(nom,position);
		this.turbo=false;
	}
	public boolean isTurbo() {
		return this.turbo;
	}
	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	@Override
	public void seDeplacer() {
		super.seDeplacer();	
		if(this.turbo) {
			super.seDeplacer();
		}				
	}

}
