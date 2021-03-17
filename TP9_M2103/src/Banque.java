import java.util.ArrayList;
import java.util.List;

public class Banque  {
	private List<CompteBancaire> comptes;
	private String libelle;
	public Banque(String libelle) {
		this.libelle = libelle;
		this.comptes = new ArrayList<>();
		
	}
	public String getLibelle() {
		return this.libelle;
	}
	public void ouvrir(String numero, float v) throws ArithmeticException {
		if(this.estCompteExistant(numero)) {
			throw new ArithmeticException("compte déja existant");
		}
		CompteBancaire c = new CompteBancaire(numero);
		c.déposer(v);
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
	public CompteBancaire getCompte(String numero) {
		if(!this.estCompteExistant(numero)) {
			return null;
		} else {
		return new CompteBancaire(numero);
		}	
	}
	@Override
	public String toString() {
		return "[Banque	; " + this.getLibelle() + " " + this.comptes + "]";
	}
	
}
