public class BlokVlaku {
    private Pozicia pozicia;
    private final TypBlokuVlaku typ;
    private final PolickovyObrazok obrazok;
    
    public BlokVlaku(Pozicia pozicia, TypBlokuVlaku typ) {
        this.pozicia = pozicia;
        this.typ = typ;
        this.obrazok = new PolickovyObrazok(typ.getCestaKObrazku());
        this.obrazok.zmenUhol(pozicia.getSmer().getUhol());
        this.obrazok.zmenPoziciu(pozicia.getX(), pozicia.getY());
    }
    
    public void posun(Smer smer) {
        this.pozicia = this.pozicia.vytvorNovu(smer);
        this.obrazok.zmenUhol(this.pozicia.getSmer().getUhol());
        this.obrazok.zmenPoziciu(this.pozicia.getX(), this.pozicia.getY());
    }
}
