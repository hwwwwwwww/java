
public class Main {

	public static void main(String[] args) {
		Combat combat = new Combat();
		combat.setCible(new Position(50,122));
		Robot1G r1 = new Robot1G("alpha");
		Robot2G r2 = new Robot2G("beta",new Position(0,0));
		r2.pivoterGauche();
		Robot3G r3 = new Robot3G("omega",new Position(0,0));
		r3.pivoterGauche();
		r3.setTurbo(true);
		combat.ajouterRobot(r1);
		combat.ajouterRobot(r2);
		combat.ajouterRobot(r3);
		combat.combattre();
	}

}
 