public class Segment {
    private Obdlznik zobrazenie;
    
    public Segment(int x, int y, int sirka, int vyska) {
        this.zobrazenie = new Obdlznik();
        
        this.zobrazenie.posunVodorovne(x);
        this.zobrazenie.posunZvisle(y);
        
        this.zobrazenie.zmenStrany(sirka, vyska);
        
        this.zobrazenie.zmenFarbu("black");
        
        this.zobrazenie.zobraz();
    }
    
    public void zasviet() {
        this.zobrazenie.zmenFarbu("yellow");
    }
    
    public void zhasni() {
        this.zobrazenie.zmenFarbu("black");
    }
}
