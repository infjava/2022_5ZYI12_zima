import fri.shapesge.Obrazok;

public class PolickovyObrazok {
    private final Obrazok obrazok;
    private int x;
    private int y;
    
    public PolickovyObrazok(String cesta) {
        this.obrazok = new Obrazok(cesta);
        this.obrazok.posunZvisle(-100);
        this.obrazok.posunVodorovne(-100);
        this.obrazok.zobraz();
        
        this.x = 0;
        this.y = 0;
    }
    
    public void zmenUhol(int uhol) {
        this.obrazok.zmenUhol(uhol);
    }
    
    public void zmenPoziciu(int x, int y) {
        int zmenaX = x - this.x;
        int zmenaY = y - this.y;
        this.obrazok.posunVodorovne(zmenaX * 35);
        this.obrazok.posunZvisle(zmenaY * 35);
        this.x = x;
        this.y = y;
    }
}
