
public class CaseNormale extends Case {
	public CaseNormale(int numero) {
		super(numero);
		
	}

	@Override
	public int nouvellePosition(int valeurDé) {
		if(valeurDé == 6) {
			return 20;
		}else {
		return this.getPosition()+valeurDé;
	}
	}	
}
