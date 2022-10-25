public class Hra {
    private Hrac hrac;
    private Bot bot;
    private Score score;
    private Manazer manazer;
    
    public Hra() {
        this.hrac = new Hrac();
        this.bot = new Bot();
        this.score = new Score();
        this.manazer = new Manazer();
    }
    
    public void spusti() {
        this.manazer.spravujObjekt(this.hrac);
        this.manazer.spravujObjekt(this.bot);
        this.manazer.spravujObjekt(this);
    }
    
    public void zrus() {
        System.exit(0);
    }
}
