import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner entr�e = new Scanner(System.in);
		Monome m = new Monome(0.0F,0);
		Monome m2 = new Monome(0.0F,0);
		float coefficient;
		int exposant;
		int choix;
		do {
		System.out.println("Quel est votre choix :");
		System.out.println("	1- modifier le premier m�nome");
		System.out.println("	2- modifier le deuxi�me mon�me");
		System.out.println("	3- afficher le premier mon�me");
		System.out.println("	4- afficher le deuxi�me mon�me");
		System.out.println("	5- calculer la somme des 2 mon�mes");
		System.out.println("	6- calculer le produit des 2 mon�mes");
		System.out.println("	7- calculer la d�riv�e du premier mon�me");
		System.out.println("	8- calculer la d�riv�e du deuxi�me mon�me");
		System.out.println("	9- quitter l'application");
		choix = entr�e.nextInt();
		
		switch(choix) {
		case 1:
			System.out.println("Saisir coeff premier monome");
			coefficient = entr�e.nextFloat();
			System.out.println("Saisir expo premier monome");
			exposant = entr�e.nextInt();
			m = new Monome(coefficient,exposant);
			break;
		case 2:	
			System.out.println("Saisir coeff deuxieme monome");
			coefficient = entr�e.nextFloat();
			System.out.println("Saisir expo deuxieme monome");
			exposant = entr�e.nextInt();
			m2 = new Monome(coefficient,exposant);
			break;
		case 3:
			System.out.println("Premier mon�me = "+m);
			break;
		case 4:
			System.out.println("Deuxi�me mon�me = "+m2);
			break;
		case 5:
			m.somme(m2);
			System.out.println("Somme des deux monomes = " + m);
			break;
		case 6:
			m.produit(m2);
			System.out.println("Produit des deux monomes = " + m);
			break;
		case 7:
			m.d�riv�e();
			System.out.println("D�riv�e du premier monome = " + m);
			break;
		case 8:
			m2.d�riv�e();
			System.out.println("D�riv�e du deuxi�me monome = " + m2);
			break;
		case 9:
			break;
		default:
			System.out.println("Choix mauvais");		
			}
		}while(choix!=9);
		entr�e.close();
	}
}