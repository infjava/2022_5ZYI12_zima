public class Matica {
    private int[][] matica;
    
    public Matica(int pocetRiadkov, int pocetStlpcov) {
        this.matica = new int[pocetRiadkov][pocetStlpcov];
    }
    
    public void nastavHodnotu(int riadok, int stlpec, int hodnota) {
        this.matica[riadok - 1][stlpec - 1] = hodnota;
    }
}
