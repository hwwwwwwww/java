import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner entrée = new Scanner(System.in);
		System.out.println("Entrer un code de 4 chiffres :");
		final int TAILLE = 4;
		int[]code = new int[TAILLE];
		entrée.close();
		int somme = code[0] + code[1]	+ code[2];
		if ((code[3]%10) == (somme%7)) {
			System.out.println("Code bon");
		} else {
			System.out.println("Code incorrect");

	}
	}
}
