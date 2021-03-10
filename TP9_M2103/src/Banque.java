import java.util.List;

public class Banque extends CompteBancaire {
	private List<CompteBancaire> comptes;
	public Banque(String numero) {
		super(numero);
		this.comptes= new ArrayList<CompteBancaires>();
		
	}
}
