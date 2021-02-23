import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrée = new Scanner(System.in);
		System.out.println("Saisir le premier Intervalle");
		int bInf = entrée.nextInt();
		int bSup = entrée.nextInt();
		Intervalle i = new Intervalle(bInf,bSup);
		System.out.println("Saisir le deuxième Intervalle");
		int bInf2 = entrée.nextInt();
		int bSup2 = entrée.nextInt();
		Intervalle i2 = new Intervalle(bInf2,bSup2);
		entrée.close();
		if(i.disjoint(i2)) {
			System.out.println("Les deux intervalles sont disjoints");
		}else {
			Intervalle i3 = new Intervalle(0,0);
			i3 = i.inter(i2);
			System.out.println("Intersection des deux intervalles = " + i3);
			
			
		}
	}

}
