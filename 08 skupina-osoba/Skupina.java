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
        // Doplnit!
        // Ukazat vsetky 3 cykly - foreach, while s lokalnou premennou aj for (pristup k prvkom cez get(i)
    }
    
    public void odstranPodlaPoradia(int poradie) {
        // Doplnit!
    }
    
    public void odstranPodlaReferencie(Osoba osoba) {
        // Doplnit!
    }
    
    public void zrusSkupinu() {
        // Doplnit!
        // Ktory cyklus pouzijete? Foreach? While? Treba vobec cyklus?
    }
}
