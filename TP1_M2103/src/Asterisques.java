import java.util.Scanner;

public class Asterisques {
	public static void main(String[] args) {
		Scanner entr�e = new Scanner(System.in);
		System.out.println("Valeur de n :");
		int n = entr�e.nextInt();
		char c = '*';
		for(int i = 0 ; i<n ;i++) {		
			System.out.print(c);		
		}		
		entr�e.close();
	}
}