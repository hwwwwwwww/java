import java.util.ArrayList;
import java.util.List;
public class DecompositionEnFacteursPremiers {
	private List<Integer> factors;
	public List<Integer> compute(int n) {
		this.factors = new ArrayList<Integer>();
		int facteurPremier = 2;
		while(n > 1) {
			while(n%facteurPremier == 0) {
				this.factors.add(facteurPremier);
				n/=facteurPremier;
			}
			facteurPremier+=1;
		}
		return this.factors;
	}

}
