public class Pozicia {
    private final Smer smer;
    private final int x;
    private final int y;
    
    public Pozicia(int x, int y, Smer smer) {
        this.x = x;
        this.y = y;
        this.smer = smer;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public Smer getSmer() {
        return this.smer;
    }
    
    public Pozicia vytvorNovu(Smer smer) {
        switch (smer) {
            case VLAVO:
                return new Pozicia(this.x - 1, this.y, Smer.VLAVO);
            case VPRAVO:
                return new Pozicia(this.x + 1, this.y, Smer.VPRAVO);
            case DOLE:
                return new Pozicia(this.x, this.y + 1, Smer.DOLE);
            case HORE:
                return new Pozicia(this.x, this.y - 1, Smer.HORE);
            default:
                return this;
        }
    }
}

