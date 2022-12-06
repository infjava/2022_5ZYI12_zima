import java.util.Scanner;

public class Menu {
    private Scanner vstup;
    private ZoznamTimov zoznam;
    
    public Menu() {
        this.vstup = new Scanner(System.in);
        this.zoznam = new ZoznamTimov();
    }
    
    public void vykonaj() {
        String prikaz;
        do {
            System.out.println("Zadaj prikaz:");
            System.out.println("ukonci - ukonci app");
            prikaz = vstup.nextLine();
            switch (prikaz) {
                case "pridaj":
                    this.pridajTim();
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
}
