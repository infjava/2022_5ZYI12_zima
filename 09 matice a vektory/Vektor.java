public class Vektor {
    private int[] vektor;
    
    public Vektor(int pocetRozmerov) {
        this.vektor = new int[pocetRozmerov];
    }
    
    public void nastavHodnotu(int rozmer, int hodnota) {
        this.vektor[rozmer - 1] = hodnota;
    }
}
