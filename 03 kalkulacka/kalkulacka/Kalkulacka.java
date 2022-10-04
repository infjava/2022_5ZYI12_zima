public class Kalkulacka {
    private int vysledok;
    
    public Kalkulacka() {
        this.vysledok = 0;
    }
    
    public void vykonaj(String operator, int operand) {
        switch (operator) {
            case "+":
                this.vysledok = this.vysledok + operand;
                break;
            case "-":
                this.vysledok = this.vysledok - operand;
                break;
            case "*":
                this.vysledok = this.vysledok * operand;
                break;
            case "/":
                this.vysledok = this.vysledok / operand;
                break;
        }
    }
    
    public int getVysledok() {
        return this.vysledok;
    }
    
    public void vlozOperand(int operand) {
        this.vysledok = operand;
    }
}
