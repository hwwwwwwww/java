import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IntervalleTest {

    private Intervalle i1;

    @Before
    public void setUp() throws Exception {
        this.i1 = new Intervalle(-2, 20);
    }

    @After
    public void tearDown() throws Exception {
        this.i1 = null;
    }

    @Test
    public void testGetBorneInf() {
        assertEquals(-2, this.i1.getBorneInf());
    }

    @Test
    public void testGetBorneSup() {
        assertEquals(20, this.i1.getBorneSup());
    }

    @Test  
    public void testDisjoint() {
        assertTrue(i1.disjoint(new Intervalle(-10, -5)));
        assertTrue(i1.disjoint(new Intervalle(30, 40)));
        assertFalse(i1.disjoint(new Intervalle(-5, -2)));
        assertFalse(i1.disjoint(new Intervalle(-5, -1)));
        assertFalse(i1.disjoint(new Intervalle(20, 25)));
        assertFalse(i1.disjoint(new Intervalle(19, 25)));
    }

    @Test
    public void testUnion() {
        Intervalle i2 = i1.union(i1);
        assertEquals(-2, i2.getBorneInf());
        assertEquals(20, i2.getBorneSup());
        i2 = i1.union(new Intervalle(-5, 50));
        assertEquals(-5, i2.getBorneInf());
        assertEquals(50, i2.getBorneSup());
        i2 = i1.union(new Intervalle(-5, 18));
        assertEquals(-5, i2.getBorneInf());
        assertEquals(20, i2.getBorneSup());
        i2 = i1.union(new Intervalle(2, 10));
        assertEquals(-2, i2.getBorneInf());
        assertEquals(20, i2.getBorneSup());
        i2 = i1.union(new Intervalle(2, 30));
        assertEquals(-2, i2.getBorneInf());
        assertEquals(30, i2.getBorneSup());

    }

    @Test
    public void testInter() {
        Intervalle i2 = i1.inter(i1);
        assertEquals(-2, i2.getBorneInf());
        assertEquals(20, i2.getBorneSup());
        i2 = i1.inter(new Intervalle(-5, 50));
        assertEquals(-2, i2.getBorneInf());
        assertEquals(20, i2.getBorneSup());
        i2 = i1.inter(new Intervalle(-5, 18));
        assertEquals(-2, i2.getBorneInf());
        assertEquals(18, i2.getBorneSup());
        i2 = i1.inter(new Intervalle(2, 10));
        assertEquals(2, i2.getBorneInf());
        assertEquals(10, i2.getBorneSup());
        i2 = i1.inter(new Intervalle(2, 30));
        assertEquals(2, i2.getBorneInf());
        assertEquals(20, i2.getBorneSup());
    }

    @Test
    public void testComprend() {
        assertTrue(this.i1.comprend(-2));
        assertTrue(this.i1.comprend(20));
        assertTrue(this.i1.comprend(5));
        assertFalse(this.i1.comprend(-10));
        assertFalse(this.i1.comprend(30));
    }

    @Test
    public void testToString() {
        assertEquals("[-2 ; 20]", this.i1.toString());
    }

    @Test
    public void testINFINI_ZERO() {
        assertEquals(Integer.MIN_VALUE, Intervalle.INFINI_ZERO.getBorneInf());
        assertEquals(0, Intervalle.INFINI_ZERO.getBorneSup());
    }

    @Test
    public void testZERO_INFINI() {
        assertEquals(0, Intervalle.ZERO_INFINI.getBorneInf());
        assertEquals(Integer.MAX_VALUE, Intervalle.ZERO_INFINI.getBorneSup());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionIntervalle() {
        new Intervalle(4, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionUnion() {
        i1.union(new Intervalle(23, 40));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionInter() {
        i1.inter(new Intervalle(23, 40));
    }

}