import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Dur�eTest {

    @Test
    public void testGetters() {
        Dur�e d = new Dur�e(1, 2, 3);
        assertEquals(1, d.getHeures());
        assertEquals(2, d.getMinutes());
        assertEquals(3, d.getSecondes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHeuresNegative() {
        new Dur�e(-1, 2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinutesNegative() {
        new Dur�e(1, -2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinutesSuperieur59() {
        new Dur�e(1, 60, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSecondesNegative() {
        new Dur�e(1, 2, -3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSecondesSuperieur59() {
        new Dur�e(1, 2, 60);
    }

    @Test
    public void testEgal() {
        assertTrue(new Dur�e(1, 2, 3).�gal(new Dur�e(1, 2, 3)));
    }

    @Test
    public void testNonEgal() {
        assertFalse(new Dur�e(1, 2, 3).�gal(new Dur�e(2, 2, 3)));
        assertFalse(new Dur�e(1, 2, 3).�gal(new Dur�e(1, 1, 3)));
        assertFalse(new Dur�e(1, 2, 3).�gal(new Dur�e(1, 2, 2)));
    }

    @Test
    public void testAjouterUneSeconde() {
        Dur�e d123 = new Dur�e(1, 2, 3);
        d123.ajouterUneSeconde();
        assertTrue(new Dur�e(1, 2, 4).�gal(d123));
        Dur�e d1259 = new Dur�e(1, 2, 59);
        d1259.ajouterUneSeconde();
        assertTrue(new Dur�e(1, 3, 0).�gal(d1259));
        Dur�e d5959 = new Dur�e(1, 59, 59);
        d5959.ajouterUneSeconde();
        assertTrue(new Dur�e(2, 0, 0).�gal(d5959));
    }

    @Test
    public void testInf() {
        assertTrue(new Dur�e(1, 2, 3).inf(new Dur�e(2, 2, 3)));
        assertTrue(new Dur�e(1, 2, 3).inf(new Dur�e(1, 3, 3)));
        assertTrue(new Dur�e(1, 2, 3).inf(new Dur�e(1, 2, 4)));
    }

    @Test
    public void testNonInf() {
        assertFalse(new Dur�e(1, 2, 3).inf(new Dur�e(1, 2, 3)));
        assertFalse(new Dur�e(2, 2, 3).inf(new Dur�e(1, 2, 3)));
        assertFalse(new Dur�e(1, 3, 3).inf(new Dur�e(1, 2, 3)));
        assertFalse(new Dur�e(1, 2, 4).inf(new Dur�e(1, 2, 3)));
    }

    @Test
    public void testToString() {
        assertEquals("1:2:3", new Dur�e(1, 2, 3).toString());
    }
}