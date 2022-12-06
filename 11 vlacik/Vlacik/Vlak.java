public class Vlak {
    private BlokVlaku rusen;
    
    public Vlak() {
        this.rusen = new BlokVlaku(new Pozicia(0, 0, Smer.VLAVO), TypBlokuVlaku.RUSEN);
        BlokVlaku vagon1 = new BlokVlaku(new Pozicia(1, 0, Smer.VLAVO), TypBlokuVlaku.VAGON_ZELENY);
        this.rusen.pripoj(vagon1);
        BlokVlaku vagon2 = new BlokVlaku(new Pozicia(2, 0, Smer.VLAVO), TypBlokuVlaku.VAGON_MODRY);
        vagon1.pripoj(vagon2);
        BlokVlaku vagon3 = new BlokVlaku(new Pozicia(3, 0, Smer.VLAVO), TypBlokuVlaku.VAGON_CERVENY);
        vagon2.pripoj(vagon3);
    }
    
    public void posunHore() {
        this.rusen.posun(Smer.HORE);
    }
    
    public void posunDole() {
        this.rusen.posun(Smer.DOLE);
    }
    
    public void posunVlavo() {
        this.rusen.posun(Smer.VLAVO);
    }
    
    public void posunVpravo() {
        this.rusen.posun(Smer.VPRAVO);
    }
}
