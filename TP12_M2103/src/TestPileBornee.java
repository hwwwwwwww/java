import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPileBornee {

	private PileBornee p;
	@Before
	public void setUp() throws Exception {
		this.p= new PileBornee(50);
	}

	@After
	public void tearDown() throws Exception {
		this.p=null;
	}

	@Test
	public void test1() {
		assertTrue(p.isEmpty());	
	}
	@Test
	public void test2() throws FullStackException {
		this.p.push(25);
		assertFalse(p.isEmpty());
	}
	@Test
	public void test3() {
		assertEquals(50,this.p.getMaxSize());	
	}
	@Test 
	public void test4() throws FullStackException {
	    this.p.push(30);
		assertEquals(50,this.p.getMaxSize());	
	}
	@Test
	public void test5() {
	    assertEquals(0,this.p.getSize());
	}
	 @Test(expected = FullStackException.class)
	public void test6() throws FullStackException {
	   PileBornee p1 = new PileBornee(2);
	   p1.push(1);
	   assertEquals(1,p1.getSize());
	   p1.push(1);
	   assertEquals(2,p1.getSize());
	   p1.push(1);
	
	}
	@Test
	public void test7() {
	   assertFalse(this.p.isFull());
	}
	@Test
	public void test8() throws FullStackException {
		 PileBornee p1 = new PileBornee(2);
		   p1.push(1);
		   assertFalse(p1.isFull());
		   p1.push(1);
		   assertTrue(p1.isFull());
	}
	 @Test(expected = FullStackException.class)
	public void test9() throws EmptyStackException, FullStackException {
		 PileBornee p1 = new PileBornee(2);
		   p1.push(1);
		   assertEquals(1,p1.top());
		   p1.push(1);
		   assertEquals(1,p1.top());
		   p1.push(6);
		   assertEquals(1,p1.top());
	}
	 @Test(expected = EmptyStackException.class)
	public void test10() throws EmptyStackException  {
		 PileBornee p1 = new PileBornee(2);
		   p1.pop();  
	}
	@Test
	public void test11() throws EmptyStackException, FullStackException {
		 PileBornee p1 = new PileBornee(2);
		   p1.push(1);
		   p1.pop();
		   assertTrue(p1.isEmpty());
		   p1.push(1);
		   p1.push(4);
		   p1.pop();
		   assertEquals(1,p1.top());
	}
	 @Test(expected = EmptyStackException.class)
	public void test12() throws EmptyStackException {
		 this.p.top();
			   
	}
	 @Test(expected = IllegalArgumentException.class)
		public void test13() throws EmptyStackException {
			PileBornee p1 = new PileBornee(-3);
			p1.top();		   
		}
	
	 @Test(expected = FullStackException.class)
		public void testPushException() throws FullStackException {
		 PileBornee p1 = new PileBornee(1);
		 p1.push(1);
		 p1.push(1);
	 }

}
