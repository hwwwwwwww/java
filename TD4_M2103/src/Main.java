import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrée = new Scanner(System.in);
		System.out.println("Saisir rouge");
		int r = entrée.nextInt();
		System.out.println("Saisir vert");
		int v = entrée.nextInt();
		System.out.println("Saisir bleu");
		int b = entrée.nextInt();
		entrée.close();
		PointColoré p = new PointColoré(0.0F,0.0F,r,v,b);
		System.out.println(p);
	}

}
