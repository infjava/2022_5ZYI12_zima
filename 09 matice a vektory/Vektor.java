public class Vektor {
    private int[] vektor;
    
    public Vektor(int pocetRozmerov) {
        this.vektor = new int[pocetRozmerov];
    }
    
    public void nastavHodnotu(int rozmer, int hodnota) {
        this.vektor[rozmer - 1] = hodnota;
    }
    
    private int[] getPole() {
        return this.vektor;
    }
    
    public int skalarnySucin(Vektor druhy) {
        int[] druhePole = druhy.getPole();
        if (this.vektor.length != druhePole.length) {
            System.out.println("Neda sa vypocitat");
            return 0;
        }
        
        int medzivysledok = 0;
        for (int i = 0; i < this.vektor.length; i++) {
            medzivysledok += this.vektor[i] * druhePole[i];
        }
        
        return medzivysledok;
    }
}
