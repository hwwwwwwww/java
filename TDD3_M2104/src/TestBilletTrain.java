import static org.junit.Assert.*;

import org.junit.Test;

public class TestBilletTrain {

	

	@Test (expected=IllegalArgumentException.class)
	public void testDistanceParcourueAuMoins2km() {
		BilletTrain sncf = new BilletTrain(2F);
	}
	@Test 
	public void testTariffBarêmeBordPlusde2kms() {
		BilletTrain sncf = new BilletTrain(2.5F);
		assertEquals(10,sncf.getTarif(true));
	}
	@Test 
	public void testTariffBarêmeContrôlePlusde2kms() {
		BilletTrain sncf = new BilletTrain(2.5F);
		assertEquals(50,sncf.getTarif(false));
	}
	@Test 
	public void testTariffBarêmeBordPlusde25kms() {
		BilletTrain sncf = new BilletTrain(26);
		assertEquals(15,sncf.getTarif(true));
	}
	@Test 
	public void testTariffBarêmeContrôlePlusde25kms() {
		BilletTrain sncf = new BilletTrain(26);
		assertEquals(50,sncf.getTarif(false));
	}
	@Test 
	public void testTariffBarêmeBordPlusde50kms() {
		BilletTrain sncf = new BilletTrain(51);
		assertEquals(25,sncf.getTarif(true));
	}
	@Test 
	public void testTariffBarêmeContrôlePlusde50kms() {
		BilletTrain sncf = new BilletTrain(51);
		assertEquals(50,sncf.getTarif(false));
	}
	@Test 
	public void testTariffBarêmeBordPlusde100kms() {
		BilletTrain sncf = new BilletTrain(101);
		assertEquals(35,sncf.getTarif(true));
	}
	@Test 
	public void testTariffBarêmeContrôlePlusde100kms() {
		BilletTrain sncf = new BilletTrain(101);
		assertEquals(50,sncf.getTarif(false));
	}
	@Test 
	public void testTariffBarêmeBordPlusde150kms() {
		BilletTrain sncf = new BilletTrain(151);
		assertEquals(60,sncf.getTarif(true));
	}
	@Test 
	public void testTariffBarêmeContrôlePlusde150kms() {
		BilletTrain sncf = new BilletTrain(151);
		assertEquals(90,sncf.getTarif(false));
	}
	@Test 
	public void testTariffBarêmeBordPlusde300kms() {
		BilletTrain sncf = new BilletTrain(400);
		assertEquals(90,sncf.getTarif(true));
	}
	@Test 
	public void testTariffBarêmeContrôlePlusde300kms() {
		BilletTrain sncf = new BilletTrain(400);
		assertEquals(120,sncf.getTarif(false));
	}


}
