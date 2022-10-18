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
    
    public boolean jePalindrom() {
        for (int i = 0; i < this.retazec.length(); i++) {
            int iOdZadu = this.retazec.length() - i - 1;
            if (this.retazec.charAt(i) != this.retazec.charAt(iOdZadu)) {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean jePalindromJednoducho() {
        return new StringBuilder(this.retazec)
            .reverse()
            .toString()
            .equals(this.retazec);
    }
}
