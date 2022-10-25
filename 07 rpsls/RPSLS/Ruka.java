public class Ruka {
    private Obrazok gesto;
    private int aktualneGesto;
    
    public Ruka(int x) {
        this.aktualneGesto = 0;
        this.gesto = new Obrazok(this.getCestaKuGestu());
        this.gesto.zobraz();
        this.gesto.zmenPolohu(x, 100);
    }
    
    public void zmenGestoDopredu() {
        this.aktualneGesto = (this.aktualneGesto + 1) % 5;
        this.ukazGesto();
    }
    
    public void zmenGestoDozadu() {
        this.aktualneGesto = (this.aktualneGesto + 4) % 5;
        this.ukazGesto();
    }
    
    public void zmenGesto(int cisloGesta) {
        this.aktualneGesto = cisloGesta;
        this.ukazGesto();
    }
    
    private void ukazGesto() {
        this.gesto.zmenObrazok(this.getCestaKuGestu());
    }
    
    private String getCestaKuGestu() {
        return String.format("pics/%s.png", this.getNazovGesta());
    }
    
    private String getNazovGesta() {
        switch (this.aktualneGesto) {
            case 0:
                return "lizard";
            case 1:
                return "paper";
            case 2:
                return "rock";
            case 3:
                return "scissors";
            case 4:
                return "spock";
            default:
                return null;
        }
    }
}
