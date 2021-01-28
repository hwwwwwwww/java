import java.util.Scanner;
import java.lang.Math;
public class Main {

	public static void main(String[] args) {
		Scanner entr�e = new Scanner(System.in);
		System.out.println("Coefficient A :");
		int a = entr�e.nextInt();
		while(a==0) {
			System.out.println("Valeur de A nulle :");
			a = entr�e.nextInt();
		}
		System.out.println("Coefficient B :");
		int b = entr�e.nextInt();
		System.out.println("Entrez la valeur du coefficient C:");
		int c = entr�e.nextInt();
		double delta = Math.pow(b, 2)-4*a*c;
		System.out.println("R�solution de l'�quation : " + a+"x2 + " + b +"x + " + c +" = 0" );
		System.out.println("discriminant : " + delta);
		
		if(delta<0) {
			System.out.println("Aucune solution r�elle");
		} else if(delta > 0) {
			double solution = (-b+Math.sqrt(delta))/2*a;
			double solution2 =(-b-Math.sqrt(delta))/2*a;
			System.out.println("2 solutions : " + solution +" et "+ solution2);
		}else {
			double solution = -b/2*a;
			System.out.println("1 solution : " + solution);
		}		
		
		entr�e.close();
	}

}
