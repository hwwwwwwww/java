
public class Main {

	public static void main(String[] args) {
		Polynome [] hermite = new Polynome[10];
		hermite[0] = new Polynome();
		hermite[0].setMonone(new Monome(1,0));
		hermite[1] = new Polynome();
		hermite[1].setMonone(new Monome(1,1));
		System.out.println(hermite[1]);
		for(int i =2; i<10;i++) {
			Polynome terme1 =  hermite[i-1].produit(new Monome(1,1));
			Polynome terme2 = hermite[i-2].produit(new Monome(1,1));
			hermite[i]=terme1.somme(terme2);
			System.out.println(hermite[i]);
		}
		System.out.println("");
		System.out.println("");
		for(Polynome p : hermite) {
			System.out.println(p);
		}
	}

}
