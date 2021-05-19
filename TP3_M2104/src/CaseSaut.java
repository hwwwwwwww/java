
public class CaseSaut extends Case{
	private int valeurDé;
	private int caseArrivée;
	public CaseSaut(int position,int valeurDé,int caseArrivée) {
		super(position);
		this.valeurDé=valeurDé;
		this.caseArrivée=caseArrivée;
	}

	@Override
	public int nouvellePosition(int valeurDé) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
