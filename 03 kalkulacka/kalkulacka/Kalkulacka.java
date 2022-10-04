public class Kalkulacka {
    private int vysledok;
    private int operand;
    private boolean vlozenyPrvyOperand;
    private String predchadzajuciOperator;
    
    public Kalkulacka() {
        this.vysledok = 0;
        this.operand = 0;
        this.vlozenyPrvyOperand = false;
        this.predchadzajuciOperator = "";
    }
    
    public void vykonaj(String operator) {
        switch (this.predchadzajuciOperator) {
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
        switch (operator) {
            case "!":
                int faktorial = 1;
                for (int i = 2; i <= this.vysledok; i++) {
                    faktorial = faktorial * i;
                }
                this.vysledok = faktorial;
                break;
            default:
                this.predchadzajuciOperator = operator;
                break;
        }
    }
    
    public int getVysledok() {
        return this.vysledok;
    }
    
    public void vlozOperand(int operand) {
        if (this.vlozenyPrvyOperand) {
            this.operand = operand;
        } else {
            this.vysledok = operand;
            this.vlozenyPrvyOperand = true;
        }
    }
}
