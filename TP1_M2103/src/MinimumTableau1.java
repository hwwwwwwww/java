import java.util.Arrays;

public class MinimumTableau1 {

	public static void main(String[] args) {
		int[] tableau = {55, -67, 112, 6, -210, 5, 690, 0, 34, 88 };
		int minimum = tableau[0];
		for (int i = 1; i<tableau.length; i++) {
			if (tableau[i] < minimum ) {
				minimum = tableau[i];
			}
		}
		System.out.println("Valeurs du tableau : " + Arrays.toString(tableau));
		System.out.println("Valeur minimale du tableau : " + minimum);
	}
}
