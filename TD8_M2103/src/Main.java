import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Roboticus> jeu1 = new ArrayList<>();
		jeu1.add(new RoboticusIntellectuel(3,20));
		jeu1.add(new RoboticusSurdoue(6,11));
		jeu1.add(new RoboticusSportif(4,8));
		jeu1.add(new RoboticusIntellectuel(5,32));
		
		System.out.println("jeu1 : \n" + toStringJeu(jeu1));
		
		List<Roboticus> jeu2 = new ArrayList<>();
		jeu2.add(new RoboticusIntellectuel(3,2));
		jeu2.add(new RoboticusSurdoue(6,11));
		jeu2.add(new RoboticusSportif(4,8));
		
		System.out.println("jeu2 : \n" + toStringJeu(jeu2));
		
		jouer(jeu1,jeu2);
		System.out.println("jeu1 : \n" + toStringJeu(jeu1));
		System.out.println("jeu2 : \n" + toStringJeu(jeu2));
		
	}
	public static String toStringJeu(List<Roboticus> jeu) {
		String resultat = "";
		for (Roboticus r: jeu) {
			resultat+=r;
			resultat+="\n";
		}
		return resultat;
	}
	public static void jouer(List<Roboticus> jeu1, List<Roboticus> jeu2) {
		int nbPointsJeu1 = 0;
		for(Roboticus r : jeu1) {
			nbPointsJeu1+=r.points();
		}
		int nbPointsJeu2 = 0;
		for(Roboticus r : jeu2) {
			nbPointsJeu2+=r.points();
		}
		if(nbPointsJeu1 > nbPointsJeu2) {
			for(Roboticus r : jeu1) {
				if(r instanceof RoboticusSurdoue) {
					((RoboticusSurdoue) r).setNbNeurones(2);;
				}
			}
		}
	}

}
