
public class CaseAttente extends Case{
	private int valeurD�;
	
	 public CaseAttente(int position, int valeurD�) {
		super(position);
		this.valeurD�=valeurD�;
	}
	@Override
	public int nouvellePosition(int valeurD�) {
		
		if (valeurD� >= 2) {
			return this.getPosition()+valeurD�;
		} else {
		return this.getPosition();
	}
	}

}
