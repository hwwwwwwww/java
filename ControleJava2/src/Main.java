
public class Main {

	public static void main(String[] args) {
		Nbns n1 = new Nbns(5.06,15);
		Nbns n2 = new Nbns(3.2,-5);
		System.out.println("Ordre de grandeur de " + n1 +" = " + n1.ordreGrandeur());
		System.out.println("Ordre de grandeur de " + n2 +" = " + n2.ordreGrandeur());
		System.out.println("Produit de " + n1 + " et " + n2 + " = " + n1.produit(n2));
		System.out.println(n1 +" à la puissance 5 = " );
	}

}
