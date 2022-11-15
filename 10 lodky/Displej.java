public class Displej {
    private PolickoDispleja[][] policka;
    
    public Displej(int sirka, int vyska, int sirkaPolicka) {
        this.policka = new PolickoDispleja[vyska][sirka];
        
        for (int riadok = 0; riadok < vyska; riadok++) {
            for (int stlpec = 0; stlpec < sirka; stlpec++) {
                this.policka[riadok][stlpec] = new PolickoDispleja(
                    stlpec * sirkaPolicka,
                    riadok * sirkaPolicka,
                    sirkaPolicka
                );
            }
        }
    }
    
    public void zobrazZasahLode(int stlpec, int riadok) {
        this.policka[riadok][stlpec].zobrazZasahLode();
    }
    
    public void zobrazZasahVody(int stlpec, int riadok) {
        this.policka[riadok][stlpec].zobrazZasahVody();
    }
    
    public void reset(int stlpec, int riadok) {
        this.policka[riadok][stlpec].reset();
    }
}
