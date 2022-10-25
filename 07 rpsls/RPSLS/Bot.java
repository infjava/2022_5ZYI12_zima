import java.util.Random;

public class Bot {
    private Ruka ruka;
    private Random nahoda;
    
    public Bot() {
        this.ruka = new Ruka();
        this.nahoda = new Random();
    }
    
    public void tik() {
        int gesto = this.nahoda.nextInt(5);
        this.ruka.zmenGesto(gesto);
    }
}
