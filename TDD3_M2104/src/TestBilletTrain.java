import static org.junit.Assert.*;

import org.junit.Test;

public class TestBilletTrain {

	

	@Test (expected=IllegalArgumentException.class)
	public void testDistanceParcourueAuMoins2km() {
		BilletTrain sncf = new BilletTrain(2F);
	}
	@Test 
	public void testTariffBar�meBordPlusde2kms() {
		BilletTrain sncf = new BilletTrain(2.5F);
		assertEquals(10,sncf.getTarif(true));
	}
	@Test 
	public void testTariffBar�meContr�lePlusde2kms() {
		BilletTrain sncf = new BilletTrain(2.5F);
		assertEquals(50,sncf.getTarif(false));
	}
	@Test 
	public void testTariffBar�meBordPlusde25kms() {
		BilletTrain sncf = new BilletTrain(26);
		assertEquals(15,sncf.getTarif(true));
	}
	@Test 
	public void testTariffBar�meContr�lePlusde25kms() {
		BilletTrain sncf = new BilletTrain(26);
		assertEquals(50,sncf.getTarif(false));
	}
	@Test 
	public void testTariffBar�meBordPlusde50kms() {
		BilletTrain sncf = new BilletTrain(51);
		assertEquals(25,sncf.getTarif(true));
	}
	@Test 
	public void testTariffBar�meContr�lePlusde50kms() {
		BilletTrain sncf = new BilletTrain(51);
		assertEquals(50,sncf.getTarif(false));
	}
	@Test 
	public void testTariffBar�meBordPlusde100kms() {
		BilletTrain sncf = new BilletTrain(101);
		assertEquals(35,sncf.getTarif(true));
	}
	@Test 
	public void testTariffBar�meContr�lePlusde100kms() {
		BilletTrain sncf = new BilletTrain(101);
		assertEquals(50,sncf.getTarif(false));
	}
	@Test 
	public void testTariffBar�meBordPlusde150kms() {
		BilletTrain sncf = new BilletTrain(151);
		assertEquals(60,sncf.getTarif(true));
	}
	@Test 
	public void testTariffBar�meContr�lePlusde150kms() {
		BilletTrain sncf = new BilletTrain(151);
		assertEquals(90,sncf.getTarif(false));
	}
	@Test 
	public void testTariffBar�meBordPlusde300kms() {
		BilletTrain sncf = new BilletTrain(400);
		assertEquals(90,sncf.getTarif(true));
	}
	@Test 
	public void testTariffBar�meContr�lePlusde300kms() {
		BilletTrain sncf = new BilletTrain(400);
		assertEquals(120,sncf.getTarif(false));
	}


}
