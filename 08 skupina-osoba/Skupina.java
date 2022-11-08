import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Skupina {
    private ArrayList<Osoba> osoby;
    
    public Skupina() {
        this.osoby = new ArrayList<Osoba>();
    }
    
    public void zapisDoSuboru(String nazovSuboru) throws IOException {
        PrintWriter zapisovac = new PrintWriter(new File(nazovSuboru));
        
        for (Osoba osoba : this.osoby) {
            zapisovac.format("%s %s%n", osoba.getMeno(), osoba.getPriezvisko());
        }
        
        zapisovac.close();
    }
    
    public void nacitajZoSuboru(String nazovSuboru) throws IOException {
        Scanner citac = new Scanner(new File(nazovSuboru));
        
        this.osoby.clear();
        while (citac.hasNextLine()) {
            String meno = citac.next();
            String priezvisko = citac.nextLine();
            
            this.osoby.add(new Osoba(meno, priezvisko));
        }
        
        citac.close();
    }
    
    public void pridajObjektOsoba(Osoba novaOsoba) {
        if (this.jeClenomSkupiny(novaOsoba)) {
            System.out.println("Tato osoba uz je clenom");
            return;
        }
        
        this.osoby.add(novaOsoba);
    }
    
    public void pridajNovuOsobu(String noveMeno, String novePriezvisko) {
        this.pridajObjektOsoba(new Osoba(noveMeno, novePriezvisko));
    }
    
    public boolean jeClenomSkupiny(Osoba hladanaOsoba) {
        for (Osoba osoba : this.osoby) {
            if (osoba.porovnaj(hladanaOsoba)) {
                return true;
            }
        }
        
        return false;
    }
        
    public int getPocetClenovSkupiny() {
        return this.osoby.size();
    }
        
    public void vypisClenovSkupiny() {
        for (Osoba osoba : this.osoby) {
            osoba.vypis();
        }
    }
    
    public void odstranPodlaPoradia(int poradie) {
        // Doplnit!
    }
    
    public void odstranPodlaReferencie(Osoba osoba) {
        // Doplnit!
    }
    
    public void zrusSkupinu() {
        this.osoby.clear();
    }
}
