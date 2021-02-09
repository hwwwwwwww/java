import java.util.Arrays;
import java.util.Scanner;

public class MinimumTableau2 {

	public static void main(String[] args) {
		final int TAILLE = 10;
		int[] tableau = new int[TAILLE];
		Scanner entr�e = new Scanner(System.in);
		System.out.println("Saisir les valeurs enti�res du tableau : ");
		for(int i = 0; i < TAILLE ; i++) {
			int v = entr�e.nextInt();
			tableau[i] = v;
		}
		int minimum = tableau[0];
		for (int i = 1; i<tableau.length; i++) {
			if (tableau[i] < minimum ) {
				minimum = tableau[i];
			}
		}
		entr�e.close();
		System.out.println("Valeurs du tableau : " + Arrays.toString(tableau));
		System.out.println("Valeur minimale du tableau : " + minimum);
	}

}
