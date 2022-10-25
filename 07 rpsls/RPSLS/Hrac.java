public class Hrac {
    private Ruka ruka;
    
    public Hrac() {
        this.ruka = new Ruka(100);
    }
    
    public void posunDole() {
        this.ruka.zmenGestoDozadu();
    }
    
    public void posunHore() {
        this.ruka.zmenGestoDopredu();
    }
}
