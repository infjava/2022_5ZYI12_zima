public enum Smer {
    VLAVO(180),
    VPRAVO(0),
    HORE(270),
    DOLE(90);
    
    private int uhol;
    
    Smer(int uhol) {
        this.uhol = uhol;
    }
    
    public int getUhol() {
        return this.uhol;
    }
}
