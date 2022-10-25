public class Ruka {
    private Obrazok gesto;
    private int aktualneGesto;
    
    public Ruka() {
        this.gesto = new Obrazok("pics/lizard.png");
        this.gesto.zobraz();
        this.aktualneGesto = 0;
    }
    
    public void zmenGestoDopredu() {
        this.aktualneGesto = (this.aktualneGesto + 1) % 5;
        this.ukazGesto();
    }
    
    public void zmenGestoDozadu() {
        this.aktualneGesto = (this.aktualneGesto + 4) % 5;
        this.ukazGesto();
    }
    
    private void ukazGesto() {
        this.gesto.zmenObrazok(String.format("pics/%s.png", this.getNazovGesta()));
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
