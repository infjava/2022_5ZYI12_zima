public class PolickoDispleja {
    
    private Stvorec stvorec;
    private Kruh kruh;
    
    public PolickoDispleja(int x, int y, int sirka) {
        this.stvorec = new Stvorec();
        this.stvorec.zmenStranu(sirka - 1);
        this.stvorec.posunVodorovne(-60 + x);
        this.stvorec.posunZvisle(-50 + y);
        this.stvorec.zmenFarbu("blue");
        this.stvorec.zobraz();
        this.kruh = new Kruh();
        this.kruh.zmenPriemer(sirka - 3);
        this.kruh.posunVodorovne(-20 + x);
        this.kruh.posunZvisle(-60 + y);
    }
    
    public void zobrazZasahLode() {
        this.kruh.zmenFarbu("red");
        this.kruh.zobraz();
    }
    
    public void zobrazZasahVody() {
        this.stvorec.zmenFarbu("green");
        this.stvorec.zobraz();
    }
    
    public void reset() {
        this.kruh.skry();
        this.stvorec.zmenFarbu("blue");
    }
}