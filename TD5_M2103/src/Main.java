import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner entrée = new Scanner(System.in);
		Monome m = new Monome(0.0F,0);
		Monome m2 = new Monome(0.0F,0);
		float coefficient;
		int exposant;
		int choix;
		do {
		System.out.println("Quel est votre choix :");
		System.out.println("	1- modifier le premier mônome");
		System.out.println("	2- modifier le deuxième monôme");
		System.out.println("	3- afficher le premier monôme");
		System.out.println("	4- afficher le deuxième monôme");
		System.out.println("	5- calculer la somme des 2 monômes");
		System.out.println("	6- calculer le produit des 2 monômes");
		System.out.println("	7- calculer la dérivée du premier monôme");
		System.out.println("	8- calculer la dérivée du deuxième monôme");
		System.out.println("	9- quitter l'application");
		choix = entrée.nextInt();
		
		switch(choix) {
		case 1:
			System.out.println("Saisir coeff premier monome");
			coefficient = entrée.nextFloat();
			System.out.println("Saisir expo premier monome");
			exposant = entrée.nextInt();
			m = new Monome(coefficient,exposant);
			break;
		case 2:	
			System.out.println("Saisir coeff deuxieme monome");
			coefficient = entrée.nextFloat();
			System.out.println("Saisir expo deuxieme monome");
			exposant = entrée.nextInt();
			m2 = new Monome(coefficient,exposant);
			break;
		case 3:
			System.out.println("Premier monôme = "+m);
			break;
		case 4:
			System.out.println("Deuxième monôme = "+m2);
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
			m.dérivée();
			System.out.println("Dérivée du premier monome = " + m);
			break;
		case 8:
			m2.dérivée();
			System.out.println("Dérivée du deuxième monome = " + m2);
			break;
		case 9:
			break;
		default:
			System.out.println("Choix mauvais");		
			}
		}while(choix!=9);
		entrée.close();
	}
}