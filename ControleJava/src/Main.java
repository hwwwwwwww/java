import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrée = new Scanner(System.in);
		System.out.println("Saisir le premier Intervalle");
		int bInf = entrée.nextInt();
		int bSup = entrée.nextInt();
		Intervalle i1 = new Intervalle(bInf,bSup);
		System.out.println("Saisir le deuxième Intervalle");
		int bInf2 = entrée.nextInt();
		int bSup2 = entrée.nextInt();
		Intervalle i2 = new Intervalle(bInf2,bSup2);
		entrée.close();
		if(i1.disjoint(i2)) {
			System.out.println("Intervalles sont disjoints");
		} else {
			Intervalle i3 = i1.inter(i2);
			System.out.println("i3 = " + i3);
			System.out.println("");
			int TAILLE = i3.getBorneSup() - i3.getBorneInf() +1;
			int [] t = new int[TAILLE] ;
			int i = 0;
			int image = i3.getBorneInf();
			System.out.println("affichage première forme");
			while(i<TAILLE) {	
				t[i] = 10*image+ 5;
				System.out.print(t[i]+"    ");
				i++;
				image++;
			}
			image = i3.getBorneInf();
			System.out.println();
			System.out.println();
			System.out.println("affichage deuxième forme");
			for(int n = 0 ; n<TAILLE;n++) {
				t[n] = 10*image+ 5;
				System.out.println("f("+image+") = " + t[n]);
				image++;
				
			}
			
		
		} 
		
		
	}

}
