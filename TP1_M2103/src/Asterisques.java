import java.util.Scanner;

public class Asterisques {
	public static void main(String[] args) {
		Scanner entrée = new Scanner(System.in);
		System.out.println("Valeur de n :");
		int n = entrée.nextInt();
		char c = '*';
		for(int i = 0 ; i<n ;i++) {		
			System.out.print(c);		
		}		
		entrée.close();
	}
}