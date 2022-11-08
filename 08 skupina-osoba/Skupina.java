import java.util.ArrayList;

public class Skupina {
    private ArrayList<Osoba> osoby;
    
    public Skupina() {
        this.osoby = new ArrayList<Osoba>();
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
        int pocetPrvkov = this.osoby.size();
        for (int i = pocetPrvkov - 1; i >= 0; i--) {
            this.osoby.remove(i);
        }
    }
}
