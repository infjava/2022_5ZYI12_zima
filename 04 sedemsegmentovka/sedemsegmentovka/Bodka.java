public class Bodka {
    private Kruh zobrazenie;
    
    public Bodka(int x, int y, int priemer) {
        this.zobrazenie = new Kruh();
        
        this.zobrazenie.posunVodorovne(x - 20);
        this.zobrazenie.posunZvisle(y - 60);
        
        this.zobrazenie.zmenPriemer(priemer);
        
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
