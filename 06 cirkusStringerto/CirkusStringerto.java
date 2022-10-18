public class CirkusStringerto {
    private String retazec;
    
    public CirkusStringerto(String retazec) {
        this.retazec = retazec;
    }
    
    public String zopakuj(int pocetKrat) {
        StringBuilder vystup = new StringBuilder();
        for (int i = 0; i < pocetKrat; i++) {
            vystup.append(this.retazec);
        }
        
        return vystup.toString();
    }
}
