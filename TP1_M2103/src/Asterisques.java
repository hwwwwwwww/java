import java.util.Scanner;
	
public class Asterisques {
		public static void main(String[] args) {
			Scanner entrée = new Scanner(System.in);
			System.out.println("Valeur de n : ");
			int n = entrée.nextInt();
			entrée.close();
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int i = 1; i <= n; i++) {
				for (int k = i + 1; k <= n; k++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}