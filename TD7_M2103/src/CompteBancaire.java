
public class CompteBancaire extends Compte{
	private String numero;
	public CompteBancaire(String numero) {
		this.numero=numero;
	}
	public String getChaine() {
		return this.numero;
	}
	
	@Override
	public String toString() {
		return "Numéro : "+ this.numero + super.toString();
	}
	@Override
	public boolean equals(Object c) {
		if(c == null) {
			return false;
		}
		if(!(c instanceof CompteBancaire)) {
			return false;
		}
		if(c == this) {
			return true;
		}
	}
	
}