import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner entr�e = new Scanner(System.in);
		System.out.println("Code de 4 chiffres � saisir (1 � la fois)");
		final int TAILLE = 4;
		int[]code = new int[TAILLE];
		for (int i = 0 ; i <TAILLE; i++) {
			System.out.println("Entrez un chiffre :");
			code[i]=entr�e.nextInt();			
		}
		int somme = code[0] + code[1]+ code[2];
		if ((code[3]%10) == (somme%7)){
			System.out.println("Code bon");
		} else {
			System.out.println("Code incorrect");
	}
		entr�e.close();
	}
}
