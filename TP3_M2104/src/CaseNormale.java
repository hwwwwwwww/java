
public class CaseNormale extends Case {
	public CaseNormale(int numero) {
		super(numero);
		
	}

	@Override
	public int nouvellePosition(int valeurD�) {
		if(valeurD� == 6) {
			return 20;
		}else {
		return this.getPosition()+valeurD�;
	}
	}	
}
