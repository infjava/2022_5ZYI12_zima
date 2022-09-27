public class Osoba {
    private String meno;
    private String priezvisko;
    private String datumNarodenia;
    
    public Osoba(String meno, String priezvisko, String datumNarodenia) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.datumNarodenia = datumNarodenia;
    }
    
    public String getMeno() {
        return this.meno;
    }
    
    public String getPriezvisko() {
        return this.priezvisko;
    }
    
    public String getDatumNarodenia() {
        return this.datumNarodenia;
    }
    
    public void setMeno(String noveMeno) {
        this.meno = noveMeno;
    }
    
    public void setPriezvisko(String novePriezvisko) {
        this.priezvisko = novePriezvisko;
    }
}