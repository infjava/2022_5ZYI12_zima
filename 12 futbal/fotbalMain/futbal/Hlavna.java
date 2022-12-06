import java.util.Scanner;

public class Hlavna {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        ZoznamTimov zoznam = new ZoznamTimov();
        String prikaz;
        do {
            System.out.println("Zadaj prikaz:");
            System.out.println("ukonci - ukonci app");
            prikaz = vstup.nextLine();
            switch (prikaz) {
                case "pridaj":
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
                    break;
            }
        } while (!prikaz.equals("ukonci"));
    }
}
