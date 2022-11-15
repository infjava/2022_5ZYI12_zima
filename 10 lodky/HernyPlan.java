import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class HernyPlan {
    private Lodka[] lodky;
    private Policko[][] policka;
    private Displej displej;
    
    public HernyPlan() throws IOException {
        Scanner citac = new Scanner(new File("lodkyMapa.txt"));
        
        int sirka = citac.nextInt();
        int vyska = citac.nextInt();
        
        this.displej = new Displej(sirka, vyska, 20);
        this.policka = new Policko[vyska][sirka];
        
        int pocetLodiek = citac.nextInt();
        
        this.lodky = new Lodka[pocetLodiek];
        for (int i = 0; i < pocetLodiek; i++) {
            this.lodky[i] = new Lodka();
        }
        
        for (int riadok = 0; riadok < vyska; riadok++) {
            for (int stlpec = 0; stlpec < sirka; stlpec++) {
                int cisloLodky = citac.nextInt();
                if (cisloLodky == 0) {
                    this.policka[riadok][stlpec] = new Policko(stlpec, riadok, null);
                } else {
                    Lodka lodka = this.lodky[cisloLodky - 1];
                    this.policka[riadok][stlpec] = new Policko(stlpec, riadok, lodka);
                    lodka.priradPolicko(this.policka[riadok][stlpec]);
                }
            }
        }
        
        citac.close();
    }
}
