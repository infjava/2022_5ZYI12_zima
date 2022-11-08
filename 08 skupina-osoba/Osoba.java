import java.util.ArrayList;

public class Osoba {
    private String meno;
    private String priezvisko;
    private ArrayList<Double> body;

    public Osoba(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.body = new ArrayList<Double>();
    }
    
    public void pridajBody(double pocet) {
        this.body.add(pocet);
    }
    
    public double getPocetBodov() {
        double sucet = 0;
        
        for (double body : this.body) {
            sucet += body;
        }
        
        return sucet;
    }
    
    public double getNajlepsiaZnamka() {
        double najlepsia = Double.NEGATIVE_INFINITY;
        
        for (double body : this.body) {
            if (body > najlepsia) {
                najlepsia = body;
            }
        }
        
        return najlepsia;
    }

    public String getMeno() {
        return this.meno;
    }

    public String getPriezvisko() {
        return this.priezvisko;
    }

    public void vypis() {
        System.out.println(this.meno + " " + this.priezvisko);
    }
    
    public boolean porovnaj(Osoba druhaOsoba) {
        return this.meno.equals(druhaOsoba.getMeno())
                    && this.priezvisko.equals(druhaOsoba.getPriezvisko());
    }
}
