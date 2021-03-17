import java.util.LinkedList;
import java.util.List;

public class Banque extends CompteBancaire {
	private List<CompteBancaire> l;
	private String libelle;
	public Banque(String numero) {
		super(numero);
		this.l= new LinkedList<CompteBancaire>();
		
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
		this.l.add(c);
	} 
	public void fermer(String numero) throws ArithmeticException{
		if(!this.estCompteExistant(numero)) {
			throw new ArithmeticException("compte non existant");
		}
		if(this.solde()!=0) {
			throw new ArithmeticException("solde non nul");
		}
		CompteBancaire c = new CompteBancaire(numero);
		this.l.remove(c);
	}
	public boolean estCompteExistant(String numero) {
		CompteBancaire c = new CompteBancaire(numero);
		if(this.l.contains(c)) {
			return true;
		}else {
			return false;
		}
	}
	public CompteBancaire compte(String numero) {
		if(!this.estCompteExistant(numero)) {
			return null;
		} else {
		return new CompteBancaire(numero);
		}	
	}
	@Override
	public String toString() {
		return "[Banque	; " + this.getLibelle() + " " + this.l + "]";
	}
	
}
