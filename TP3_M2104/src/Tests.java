import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class Tests {

	private int position;
	private int valeurDé;
	private int nouvellePosition;
	

	public Tests(int position, int valeurDé, int nouvellePosition) {
		this.position = position;
		this.valeurDé = valeurDé;
		this.nouvellePosition = nouvellePosition;
	}

	
	@Parameters
	public static Collection<Object[]> getValeursParamètres(){
		return Arrays.asList(new Object[][] {{0,1,1},{1,3,4},{5,6,20},{5,3,8},{12,2,14},{12,3,12},{15,4,19},
			           {15,5,10},{16,4,22},{16,1,17},{18,5,23},{18,6,18},{20,2,22},{20,3,17},{24,2,26},
			           {24,6,24},{27,5,32},{27,4,27},{33,4,37},{33,2,33},{36,1,10},{36,6,42},{45,2,0},{45,3,48},
			           {45,2,0},{45,3,48},{45,4,47},{45,5,46},{45,6,45},{47,6,43}});
		}
	
	@Test
	public void test() {
		Plateau p = new Plateau();
		assertEquals(this.nouvellePosition,p.nouvellePosition(this.position,this.valeurDé));
	}

}
