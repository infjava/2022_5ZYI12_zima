public class Kalkulacka {
    private int vysledok;
    private int operand;
    
    public Kalkulacka() {
        this.vysledok = 0;
        this.operand = 0;
    }
    
    public void vykonaj(String operator) {
        switch (operator) {
            case "+":
                this.vysledok = this.vysledok + this.operand;
                break;
            case "-":
                this.vysledok = this.vysledok - this.operand;
                break;
            case "*":
                this.vysledok = this.vysledok * this.operand;
                break;
            case "/":
                this.vysledok = this.vysledok / this.operand;
                break;
        }
    }
    
    public int getVysledok() {
        return this.vysledok;
    }
    
    public void vlozOperand(int operand) {
        this.vysledok = operand;
    }
    
    public void vlozDruhyOperand(int operand) {
        this.operand = operand;
    }
}
