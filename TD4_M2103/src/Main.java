import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entr�e = new Scanner(System.in);
		System.out.println("Saisir rouge");
		int r = entr�e.nextInt();
		System.out.println("Saisir vert");
		int v = entr�e.nextInt();
		System.out.println("Saisir bleu");
		int b = entr�e.nextInt();
		entr�e.close();
		PointColor� p = new PointColor�(0.0F,0.0F,r,v,b);
		System.out.println(p);
	}

}
