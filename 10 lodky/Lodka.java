import java.util.ArrayList;

public class Lodka {
    private ArrayList<Policko> policka;
    
    public Lodka() {
        this.policka = new ArrayList<Policko>();
    }
    
    public void priradPolicko(Policko policko) {
        this.policka.add(policko);
    }
}
