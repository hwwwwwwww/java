
public class CaseAttente extends Case{
	private int valeurDé;
	
	 public CaseAttente(int position, int valeurDé) {
		super(position);
		this.valeurDé=valeurDé;
	}
	@Override
	public int nouvellePosition(int valeurDé) {
		
		if (valeurDé >= 2) {
			return this.getPosition()+valeurDé;
		} else {
		return this.getPosition();
	}
	}

}
