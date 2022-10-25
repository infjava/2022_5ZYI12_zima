public class Hrac {
    private Ruka ruka;
    
    public Hrac() {
        this.ruka = new Ruka();
    }
    
    public void posunDole() {
        this.ruka.zmenGestoDozadu();
    }
    
    public void posunHore() {
        this.ruka.zmenGestoDopredu();
    }
}
