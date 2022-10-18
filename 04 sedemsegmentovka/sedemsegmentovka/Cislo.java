public class Cislo {
    private Cislica jednotky;
    private Cislica desiatky;
    
    public Cislo(int x, int y) {
        this.jednotky = new Cislica(x + 30, y);
        this.desiatky = new Cislica(x, y);
    }
    
    public void zobraz(int cislo) {
        this.jednotky.zobraz((char)(cislo % 10 + '0'));
        this.desiatky.zobraz((char)(cislo / 10 + '0'));
    }
}
