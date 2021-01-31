import java.util.Scanner;

public class Asterisques {
	public static void main(String[] args) {
		Scanner entrée = new Scanner(System.in);
		System.out.println("Valeur de n :");
		int n = entrée.nextInt();
		for(int i = 0 ; i<n ;i++) {
			for(int j=0; j<n ; j++) {
				if(j<=i) {
					System.out.print("*");			
				  }						
				}
			System.out.println();
			}	
		entrée.close();
		}

}