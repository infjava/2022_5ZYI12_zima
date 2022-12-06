import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Scanner vstup;
    private ZoznamTimov zoznam;
    private ArrayList<String> registrovaneTimy;
    private Turnaj turnaj;
    
    public Menu() {
        this.vstup = new Scanner(System.in);
        this.zoznam = new ZoznamTimov();
        this.registrovaneTimy = new ArrayList<>();
        this.turnaj = null;
    }
    
    public void vykonaj() {
        String prikaz;
        do {
            System.out.println("Zadaj prikaz:");
            System.out.println("pridaj - pridaj novy tim do zoznamu timov");
            System.out.println("registruj - zaregistruj tim do vybraneho turnaja");
            System.out.println("vytvor - vytvor turnaj");
            System.out.println("ukonci - ukonci app");
            prikaz = vstup.nextLine();
            switch (prikaz) {
                case "pridaj":
                    this.pridajTim();
                    break;
                case "registruj":
                    this.registrujTim();
                    break;
                case "vytvor":
                    this.vytvorTurnaj();
                    break;
            }
        } while (!prikaz.equals("ukonci"));
    }
    
    private void pridajTim() {
        System.out.println("Zadaj nazov timu:");
        String nazovTimu = vstup.nextLine();
        System.out.println("Vyber krajinu:");
        Krajina[] vsetkyKrajiny = Krajina.values();
        for (int i = 0; i < vsetkyKrajiny.length; i++) {
            System.out.format("%d. %s%n", i, vsetkyKrajiny[i]);
        }
        int cisloKrajiny = vstup.nextInt();
        vstup.nextLine();
        Krajina krajina = vsetkyKrajiny[cisloKrajiny];
        Tim tim = new Tim(nazovTimu, krajina);
        zoznam.pridajTim(tim);
    }
    
    private void registrujTim() {
        System.out.println("Zadaj nazov timu:");
        String nazovTimu = vstup.nextLine();
        this.registrovaneTimy.add(nazovTimu);
    }
    
    private void vytvorTurnaj() {
        String[] timy = new String[this.registrovaneTimy.size()];
        
        for (int i = 0; i < timy.length; i++) {
            timy[i] = this.registrovaneTimy.get(i);
        }
        
        this.turnaj = new Turnaj(timy, this.zoznam);
    }
}
