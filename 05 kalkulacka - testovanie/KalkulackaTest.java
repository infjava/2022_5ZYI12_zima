

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
        this.otestujBinarnuOperaciu(10, '+', 3, 13);
    }
    
    @Test
    public void nasobenie10A3() {
        this.otestujBinarnuOperaciu(10, '*', 3, 30);
    }
    
    public void otestujBinarnuOperaciu(double operand1, char operator,
                                       double operand2, double ocakavanyVysledok) {
        this.kalkulacka.zadajCislo(operand1);
        this.kalkulacka.zadajOperaciu(operator);
        this.kalkulacka.zadajCislo(operand2);
        this.kalkulacka.zadajOperaciu('=');
        assertEquals(ocakavanyVysledok, this.kalkulacka.getVysledok(), 0.001);
    }
}
