
public class Test {

	public static void main(String[] args) {
		Compte c = new CompteEpargne("002", 0.1F);
		//CompteBancaire c2 = new Compte();
		c.deposer(2);
		((CompteEpargne)c).ajouterInterets();
		
		Compte [] tab = new Compte[3];
		tab[0] = new Compte();
		tab[1] = new CompteBancaire("008");
		tab[2] = new CompteEpargne("002", 0.1F);
		
		for(Compte x : tab) {
			System.out.println(x.toString());
			if(x instanceof CompteEpargne) {
				System.out.println(((CompteEpargne)x).interets());
			}
		}
	}

}
