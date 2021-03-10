
public class Compte {
	private float credit;
	private float debit;
	
	public Compte() {
		this.credit=0.0F;
		this.debit=0.0F;
	}
	
	public float solde() {
		return this.credit-this.debit;
	}
	public void deposer(float v) throws IllegalArgumentException{
		if(v<0) {
			throw new IllegalArgumentException("valeur n�gative");
		}
		this.credit+=v;
	}
	public void retirer(float v) throws IllegalArgumentException{
		if(v<0) {
			throw new IllegalArgumentException("valeur n�gative");
		}
		this.debit+=v;
	}
	
	@Override
	public String toString(){
		return "Cr�dit : " + this.credit +", D�bit : " + this.debit;
	}
}
