import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entr�e = new Scanner(System.in);
		System.out.println("Saisir le premier Intervalle");
		int bInf = entr�e.nextInt();
		int bSup = entr�e.nextInt();
		Intervalle i = new Intervalle(bInf,bSup);
		System.out.println("Saisir le deuxi�me Intervalle");
		int bInf2 = entr�e.nextInt();
		int bSup2 = entr�e.nextInt();
		Intervalle i2 = new Intervalle(bInf2,bSup2);
		System.out.println(i);
		System.out.println(i2);
		entr�e.close();
		if(i.disjoint(i2)) {
			System.out.println("Intervalles sont disjoints");
		} else {
			Intervalle i3 = new Intervalle(0,0);
			i3 = i.inter(i2);
			System.out.println("i3 = " + i3);
			
		}
		
		
	}

}
