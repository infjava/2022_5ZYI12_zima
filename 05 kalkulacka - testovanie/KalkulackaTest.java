

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* The test class KalkulackaTest.
*
* @author  (your name)
* @version (a version number or a date)
*/
public class KalkulackaTest {
    private Kalkulacka kalkulacka;
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        this.kalkulacka = new Kalkulacka();
    }
    
    @Test
    public void vlozenieOperandu5() {
        this.kalkulacka.zadajCislo(5);
        assertEquals(5, this.kalkulacka.getOperand(), 0.001);
    }

    @Test
    public void vlozenieOperandu0() {
        this.kalkulacka.zadajCislo(0);
        assertEquals(0, this.kalkulacka.getOperand(), 0.001);
    }
    
    @Test
    public void mocninaCisla10() {
        this.kalkulacka.zadajCislo(10);
        this.kalkulacka.zadajOperaciu('2');
        assertEquals(100, this.kalkulacka.getVysledok(), 0.001);
    }
    
    @Test
    public void mocninaCisla10ARovnaSa() {
        this.kalkulacka.zadajCislo(10);
        this.kalkulacka.zadajOperaciu('2');
        this.kalkulacka.zadajOperaciu('=');
        assertEquals(100, this.kalkulacka.getVysledok(), 0.001);
    }
    
    @Test
    public void scitanie10A3() {
        this.kalkulacka.zadajCislo(10);
        this.kalkulacka.zadajOperaciu('+');
        this.kalkulacka.zadajCislo(3);
        this.kalkulacka.zadajOperaciu('=');
        assertEquals(13, this.kalkulacka.getVysledok(), 0.001);
    }
    
    @Test
    public void nasobenie10A3() {
        this.kalkulacka.zadajCislo(10);
        this.kalkulacka.zadajOperaciu('*');
        this.kalkulacka.zadajCislo(3);
        this.kalkulacka.zadajOperaciu('=');
        assertEquals(30, this.kalkulacka.getVysledok(), 0.001);
    }
}
