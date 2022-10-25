public class Score {
    private Cislo zobrazovacHraca;
    private Cislo zobrazovacBota;
    private Cislica dvojbodka;
    private int skoreHraca;
    private int skoreBota;
    
    public Score() {
        this.skoreHraca = 0;
        this.skoreBota = 0;
        this.zobrazovacHraca = new Cislo(70, 240);
        this.zobrazovacHraca.zobraz(0);
        this.zobrazovacBota = new Cislo(270, 240);
        this.zobrazovacBota.zobraz(0);
        this.dvojbodka = new Cislica(185, 240);
        this.dvojbodka.zobraz(':');
    }
    
    public void zvysSkoreHraca() {
        this.skoreHraca++;
        this.zobrazovacHraca.zobraz(this.skoreHraca);
    }
    
    public void zvysSkoreBota() {
        this.skoreBota++;
        this.zobrazovacBota.zobraz(this.skoreBota);
    }
}
