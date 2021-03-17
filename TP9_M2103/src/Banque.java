import java.util.LinkedList;
import java.util.List;

public class Banque extends CompteBancaire {
	private List<CompteBancaire> comptes;
	public Banque(String numero) {
		super(numero);
		this.comptes= new LinkedList<>();
		
	}
	public String libelle() {
		return this.libelle();
	}
	public void ouvrir(String numero, float valeur) throws ArithmeticException {
		if(this.estCompteExistant(numero)) {
			throw new ArithmeticException("compte déja existant");
		}
		CompteBancaire c = new CompteBancaire(numero);
		c.déposer(valeur);
		this.comptes.add(c);
	} 
	public void fermer(String numero) throws ArithmeticException{
		if(!this.estCompteExistant(numero)) {
			throw new ArithmeticException("compte non existant");
		}
		if(this.solde()!=0) {
			throw new ArithmeticException("solde non nul");
		}
		CompteBancaire c = new CompteBancaire(numero);
		this.comptes.remove(c);
	}
	public boolean estCompteExistant(String numero) {
		CompteBancaire c = new CompteBancaire(numero);
		if(this.comptes.contains(c)) {
			return true;
		}else {
			return false;
		}
	}
	public CompteBancaire compte(String numero) throws ArithmeticException{
		if(!this.estCompteExistant(numero)) {
			throw new ArithmeticException("compte non existant");
		}
		return new CompteBancaire(numero);
	}
	@Override
	public String toString() {
		return "[Banque	; " + this.libelle() + " " + this.comptes + "]";
	}
	
}
